import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
    }
}
