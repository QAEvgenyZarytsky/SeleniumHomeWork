package CheckLinkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void openPage() {
        System.out.println("My setting before test!");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterMethod
    public void closePage() {
        System.out.println("Close my test!");
        driver.quit();
    }

}
