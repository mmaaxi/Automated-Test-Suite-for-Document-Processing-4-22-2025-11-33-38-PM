package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {

    WebDriver driver;

    @FindBy(id = "btnCargarDocumentos")
    WebElement btnCargarDocumentos;

    @FindBy(id = "opcionCargaUnica")
    WebElement opcionCargaUnica;

    @FindBy(id = "opcionCargaMultiple")
    WebElement opcionCargaMultiple;

    @FindBy(id = "recuadroCargaUnica")
    WebElement recuadroCargaUnica;

    @FindBy(className = "recuadroCargaMultiple")
    WebElement recuadroCargaMultiple;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCargarDocumentos() {
        btnCargarDocumentos.click();
    }

    public boolean isCargaUnicaVisible() {
        return opcionCargaUnica.isDisplayed();
    }

    public boolean isCargaMultipleVisible() {
        return opcionCargaMultiple.isDisplayed();
    }

    public void selectCargaUnica() {
        opcionCargaUnica.click();
    }

    public boolean isRecuadroCargaUnicaVisible() {
        return recuadroCargaUnica.isDisplayed();
    }

    public void selectCargaMultiple() {
        opcionCargaMultiple.click();
    }

    public boolean areRecuadrosCargaMultipleVisible() {
        return recuadroCargaMultiple.isDisplayed();
    }
}