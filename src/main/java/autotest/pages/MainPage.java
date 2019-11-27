package autotest.pages;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;




public class MainPage extends BasePage {





    public void setMainMenu(String itemName){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        driver.findElement(By.xpath("//*[contains(@class,'footer__nav-link underline-link')][contains(text(), '"+itemName+"')]")).click();

    }
}
