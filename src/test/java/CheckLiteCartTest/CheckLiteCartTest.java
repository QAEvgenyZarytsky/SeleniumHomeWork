package CheckLiteCartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckLiteCartTest  extends BaseForCheckLiteCartTest{



    @Test
    public void checkHomePage() {



        String homePage = driver.getTitle();

        WebElement homeBtn = driver.findElement(By.xpath("//*[@class='general-0']/*"));
        Actions builder = new Actions(driver);
        builder.click(homeBtn);
        String pageAfterClick = driver.getTitle();

        Assert.assertEquals(pageAfterClick, homePage);

        //SecondCheck
        String text = "Most Popular";
        WebElement textOnThePage = driver.findElement(By.xpath("//*[text()='Most Popular']"));
        Assert.assertEquals(textOnThePage.getText(), text);


    }

    @Test
    public void checkRubberDucks() {


        String trueTitleOfRubberDucks = "Rubber Ducks | My Store1";

        WebElement rubberDucksBtn = driver.findElement(By.xpath(
                "//div[@id='site-menu-wrapper']//a[text()='Rubber Ducks']"));
        Actions builder = new Actions(driver);
        builder.click(rubberDucksBtn).perform();
        String titleOfRubberDucks = driver.getTitle();

        Assert.assertEquals(titleOfRubberDucks, trueTitleOfRubberDucks);

        //SecondCheck
        String text = "Rubber Ducks";
        WebElement textOnThePage = driver.findElement(By.xpath("//h1[text()='Rubber Ducks']"));
        Assert.assertEquals(textOnThePage.getText(), text);


    }

    @Test
    public void checkDeliveryInformation() {


        String trueTitleOfDeliveryInformation = "Delivery Information | My Store1";

        WebElement deliveryInformationBtn = driver.findElement(By.xpath(
                "//div[@id='site-menu-wrapper']//a[text()='Delivery Information']"));

        Actions builder = new Actions(driver);
        builder.click(deliveryInformationBtn).perform();
        String titleAfterClick = driver.getTitle();

        Assert.assertEquals(titleAfterClick, trueTitleOfDeliveryInformation);

        //SecondCheck
        String text = "Aliquam eget sucipit urna.";
        WebElement textOnThePage = driver.findElement(By.xpath(
                "//*[contains(text(),'Aliquam eget sucipit urna')]"));
        Assert.assertEquals(textOnThePage.getText(), text);


    }

    @Test
    public void TermsAndConditions() {


        String trueTitleOfTermsAndConditions = "Terms & Conditions | My Store1";

        WebElement termsAndConditionsBtn = driver.findElement(By.xpath(
                "//div[@id='site-menu-wrapper']//a[text()='Terms & Conditions']"));
        Actions builder = new Actions(driver);
        builder.click(termsAndConditionsBtn).perform();
        String titleAfterClick = driver.getTitle();

        Assert.assertEquals(titleAfterClick, trueTitleOfTermsAndConditions);

        //SecondCheck
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        WebElement textOnThePage = driver.findElement(By.xpath("//*[contains(text(),'Lorem')]"));
        Assert.assertEquals(textOnThePage.getText(), text);


    }

    @Test
    public void checkDiscountsAndPromotions() {


        String trueTitleOfDiscountsAndPromotions = "4 | My Store1";
        WebElement discountsAndPromotionsBtn = driver.findElement(By.xpath(
                "//*[@class='page-5']"));
        Actions builder = new Actions(driver);
        builder.click(discountsAndPromotionsBtn).perform();
        String titleAfterClick = driver.getTitle();

        Assert.assertEquals(titleAfterClick, trueTitleOfDiscountsAndPromotions);

        //SecondCheck
        String trueTextOnPage = "Information";
        WebElement textOnThePage = driver.findElement(By.xpath("//*[@class='title'][text()='Information']"));
        Assert.assertEquals(textOnThePage.getAccessibleName(), trueTextOnPage);

    }

}

