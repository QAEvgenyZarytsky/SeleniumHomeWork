package CheckLiteCartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseForCheckLiteCartTest {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp() {

        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
