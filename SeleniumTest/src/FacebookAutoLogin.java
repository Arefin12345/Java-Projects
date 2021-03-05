import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutoLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");


        driver.findElement(By.id("email")).sendKeys("this is me");
        driver.findElement(By.id("pass")).sendKeys("this is me");
        driver.findElement(By.linkText("Forgotten password?")).click();


    }
}
