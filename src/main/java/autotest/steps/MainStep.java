package autotest.steps;

import autotest.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainStep {
MainPage mainPage=new MainPage();

    @Step("выбран пункт меню - {0}")
    public void stepSelectMenu(String nameMenu){
        mainPage.setMainMenu(nameMenu);

    }

}
