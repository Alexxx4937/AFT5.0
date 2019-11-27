package autotest.steps;

import autotest.pages.CreditPage;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class CreditStep {

    CreditPage creditPage=new CreditPage();

    @Step("выбираем валюту {0}")
    public void stepSelectCurrency(String nameCurrency){
        creditPage.setCurrency(nameCurrency);


    }
    @Step("заполняем поле сумма вклада суммой {0}")
    public void stepFieldSumm(String summ){
        creditPage.setFieldAmont(summ);
    }
    @Step("выбираем срок вклада {0}")
    public void stepDepositTerm(String term){
        creditPage.setTerm(term);
    }
    @Step("заполняем поле ежемесячного платежа {0}")
    public void stepReplenich(String replenich){
        creditPage.setReplenish(replenich);
    }
    @Step("отмечаем чекбокс {0}")
    public  void  stepChekBoxCap(String nameCheck){
        creditPage.setCheckBox(nameCheck);
    }
    @Step("проверяем что значение поля Ставка равно {0} ")
    public void stepCheckRate(String rate){
        creditPage.checkRateField(rate);
    }
    @Step("проверяем что значение поля К снятию через 6 месяцев равно {0} ")
    public void stepCheckTotalCalc(String totalCalc){
        creditPage.checkResultField(totalCalc);
    }
    @Step("проверяем что значение поля Пополнение за 6 месяцев равно {0} ")
    public void stepCheckReplenish(String replenish){
        creditPage.checkReplenishField(replenish);
    }
    @Step("проверяем что значение поля Начислено равно {0} ")
    public void stepCheckAccured(String accured){
        creditPage.checkAccuredField(accured);
    }

}
