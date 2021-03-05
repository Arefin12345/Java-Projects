import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");

        System.out.println("The title of your website is :"+driver.getTitle());

    }
}
