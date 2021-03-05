import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


//        driver.get("http://facebook.com");

//        System.out.println("The title of your website is :"+driver.getTitle());


//        driver.get("http://yahoo.com");

//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());   //print the static source of the  page
//
//        driver.navigate().back();
//        driver.navigate().to("http://google.com");

//        driver.close();  //it closes the current browser
        driver.quit();  // it closes all the browsers opened by selenium script




        
    }
}
