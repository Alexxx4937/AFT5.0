package autotest.pages;

import autotest.steps.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

        WebDriver driver = BaseStep.getDriver();

        public BasePage(){
            PageFactory.initElements(driver, this);
        }


        public void field(WebElement field, String value){
            field.click();
            field.clear();
            field.sendKeys(value);

    }
}

