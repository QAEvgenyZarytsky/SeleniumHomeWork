package CheckLinkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckLinkTest extends BaseTest {
    @Test
    public void checkLink() {
        //System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        //если уберу сторчку выше то код не работает, в path всё прописывал, не могу понять чего так происходит
        //добавил BaseTest теперь всё работает, чего так происходит не знаю!

        List<WebElement> elementsLink = driver.findElements(By.tagName("a"));
        System.out.println("This is 9 element:");
        System.out.println(elementsLink.get(9).getAccessibleName());

        String nameOfElement09 = elementsLink.get(9).getAccessibleName();
        String checkName = "Disappearing Elements";

        Assert.assertTrue(nameOfElement09.contains(checkName), "The name of element isn't valid!");
    }
}
