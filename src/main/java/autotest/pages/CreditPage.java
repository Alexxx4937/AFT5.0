package autotest.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CreditPage extends BasePage {

    @FindBy(xpath = "//div[@class='calculator__currency-row']//label[text()]")
    List<WebElement> currency;
    @FindBy(xpath = "//label[contains(@class,'currency-input-field')]/input[@name='amount']")
    WebElement fieldAmount;
    @FindBy(xpath = "//div[@class='jq-selectbox__trigger']")
    WebElement buttonTerm;
    @FindBy(xpath = "//div[@class='jq-selectbox__dropdown']//li[text()]")
    List<WebElement> term;
    @FindBy(xpath = "//input[@name='replenish']")
    WebElement replenish;

    @FindBy(xpath = "//div[@class='calculator__check-row']/div//span[@class='calculator__check-text']")
    List<WebElement> nameCheckBox;

    @FindBy(xpath = "//span[@class='js-calc-rate']")
    public WebElement totalRate;

    @FindBy(xpath = "//span[@class='js-calc-earned']")
    public WebElement totalAccured;

    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    public WebElement totalReplenish;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    public WebElement totalCalcResult;



    public void setCurrency(String nameCurrency) {

        for (WebElement item : currency) {
            if (item.getText().equalsIgnoreCase(nameCurrency)) {
                new WebDriverWait(driver, 10)
                        .until(ExpectedConditions.elementToBeClickable(item)).click();
                return;
            }
        }

        Assert.fail("Не найдена валюта - " + nameCurrency);
    }

    public void setFieldAmont(String summ) {
        field(fieldAmount, summ);
    }

    public void setTerm(String nameTerm) {
        buttonTerm.click();
        for (WebElement item : term
        ) {
            if (item.getText().equalsIgnoreCase(nameTerm)) {
                new WebDriverWait(driver, 10)
                        .until(ExpectedConditions.elementToBeClickable(item)).click();
                return;

            }
        }
        Assert.fail("Не найден срок вклада - " + nameTerm);


    }
    public void setReplenish(String nameReplenish) {
        field(replenish, nameReplenish);
    }



    public void setCheckBox(String nameCheck){
        for (WebElement item:nameCheckBox
             ) {if(item.getText().equalsIgnoreCase(nameCheck)){
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.elementToBeClickable(item)).click();

            }

            }
        }




    public void checkRateField(String rate) {
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", totalRate.getText(),
                totalRate),new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  totalRate.getText();
            return actualResult.equalsIgnoreCase(rate);}));
    }
    public void checkAccuredField(String accured) {
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", totalAccured.getText(),
                totalAccured),new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  totalAccured.getText();
            return actualResult.equalsIgnoreCase(accured);}));
    }

    public void checkReplenishField(String replenishCheck) {
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", totalReplenish.getText(),
                totalReplenish),new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  totalReplenish.getText();
            return actualResult.equalsIgnoreCase(replenishCheck);}));
    }
    public void checkResultField(String result) {
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", totalCalcResult.getText(),
                totalCalcResult),new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  totalCalcResult.getText();
            return actualResult.equalsIgnoreCase(result);}));
    }
    }

