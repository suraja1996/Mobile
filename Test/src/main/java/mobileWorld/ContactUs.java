package mobileWorld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs {
static {
System.setProperty("webdriver.chrome.driver",
"C:\\\\Users\\\\suraj.a\\\\eclipse-workspace\\\\Test\\\\src\\\\chromeDriver\\\\chromedriver.exe");
}
WebDriver driver;



@Test(priority = 1)
public void launchBrowser() throws InterruptedException {
driver = new ChromeDriver();
driver.get("https://mobileworld.azurewebsites.net/index.html#");
}



@Test(priority = 2)
public void clickContactUs() throws InterruptedException {
driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
Thread.sleep(2000);
Set<String> id = driver.getWindowHandles();
Iterator<String> it = id.iterator();
String parentId = it.next();
String childId = it.next();
driver.switchTo().window(childId);
driver.manage().window().maximize();
}



@Test(priority = 3)
public void enterName() throws InterruptedException {
driver.findElement(By.name("name")).sendKeys("suraj");
}



@Test(priority = 4)
public void enterMail() throws InterruptedException {
driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
}



@Test(priority = 5)
public void enterPhoneNumber() throws InterruptedException {
driver.findElement(By.name("phone")).sendKeys("9988997766");
}



@Test(priority = 6)
public void enterMessage() throws InterruptedException {
driver.findElement(By.name("name")).sendKeys("Hii this is suraj");
}



@Test(priority = 7)
public void clickOnSend() throws InterruptedException {
driver.findElement(By.className("btn")).click();
driver.quit();
}
}