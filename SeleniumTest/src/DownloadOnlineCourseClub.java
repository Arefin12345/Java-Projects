import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadOnlineCourseClub {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//              driver.get("http://login.salesforce.com");
        driver.get("http://facebook.com");



    }
}
