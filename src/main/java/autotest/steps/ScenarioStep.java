package autotest.steps;

import autotest.pages.MainPage;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

public class ScenarioStep {
    MainStep mainStep=new MainStep();
CreditStep creditStep=new CreditStep();


    @Когда("^выбран пункт меню \"(.+)\"$")
    public void выбранПунктМеню(String menuName) {
        mainStep.stepSelectMenu(menuName);


    }

    @Когда("^выбрана валюта \"([^\"]*)\"$")
    public void выбранаВалюта(String currency) {
creditStep.stepSelectCurrency(currency);
    }

    @Когда("^выбран срок вклада \"([^\"]*)\"$")
    public void выбранСрокВклада(String depositTerm )  {
creditStep.stepDepositTerm(depositTerm);

    }

    @Когда("^заполнено поле сумма вклада \"([^\"]*)\"$")
    public void заполненоПолеСуммаВклада(String summTerm)  {
creditStep.stepFieldSumm(summTerm);

    }

    @Когда("^заполнено поле ежемесячное пополнение \"([^\"]*)\"$")
    public void заполненоПолеЕжемесячноеПополнение(String monthlyReplenishment)  {
creditStep.stepReplenich(monthlyReplenishment);
    }

    @Когда("^отмечено поле \"([^\"]*)\"$")
    public void отмеченоПоле(String nameCap)  {
        creditStep.stepChekBoxCap(nameCap);

    }

    @Тогда("^проверено что  Ставка - \"([^\"]*)\"$")
    public void провереноЧтоСтавка(String rate)  {
creditStep.stepCheckRate(rate);

    }

    @Тогда("^проверено что  К снятию через 6 месяцев– \"([^\"]*)\"$")
    public void провереноЧтоКСнятиюЧерезМесяцев( String result)  {
        creditStep.stepCheckTotalCalc(result);

    }

    @Тогда("^проверено что  Пополнение за 6 месяцев - \"([^\"]*)\"$")
    public void провереноЧтоПополнениеЗаМесяцев( String replenish)  {
        creditStep.stepCheckReplenish(replenish);

    }

    @Тогда("^проверено что  Начислено - \"([^\"]*)\"$")
    public void провереноЧтоНачислено(String accured)  {
        creditStep.stepCheckAccured(accured);

    }
}
