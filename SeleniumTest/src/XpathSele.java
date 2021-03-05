import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSele {

       public static void main(String[] args) {
              System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

              WebDriver driver = new ChromeDriver();
//              driver.get("http://login.salesforce.com");
              driver.get("http://facebook.com");

//
//              driver.findElement(By.id("username")).sendKeys("this is me");
//              driver.findElement(By.id("password")).sendKeys("this is me");
//              driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();  //Xpath

              driver.findElement(By.cssSelector("#pass")).sendKeys("emailAddress");

       }




}
