package CheckLinkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckLink {
    @Test
    public void checkLink() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        //если уберу сторчку выше то код не работает, в path всё прописывал, не могу понять чего так происходит

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> elementsLink = driver.findElements(By.tagName("a"));
        System.out.println("This is 9 element:");
        System.out.println(elementsLink.get(9).getAccessibleName());

        String nameOfElement09 = elementsLink.get(9).getAccessibleName();
        String checkName = "Disappearing Elements";

        Assert.assertTrue(nameOfElement09.contains(checkName), "The name of element isn't valid!");
    }
}
