package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Formulario.Formulario;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[1]/div/div/button")
    private WebElement btnFormulario;

    public Formulario pressButton() {
        CommonEvents.clickButton(btnFormulario);
        return new Formulario();
    }
}
