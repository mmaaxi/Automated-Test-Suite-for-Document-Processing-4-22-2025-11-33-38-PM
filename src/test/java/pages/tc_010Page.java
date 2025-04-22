package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc_010Page {
    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By processButton = By.id("processButton");
    private By slipIndicator = By.id("slipIndicator");
    private By historyIndicator = By.id("historyIndicator");

    public Tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToApplication() {
        driver.get("http://application.url");
    }

    public void uploadRequiredDocuments() {
        WebElement uploadElem = driver.findElement(uploadButton);
        uploadElem.click();
        // Add logic to handle file upload
    }

    public void processDocuments() {
        WebElement processElem = driver.findElement(processButton);
        processElem.click();
        // Add logic to verify processing
    }

    public boolean isSlipGenerated() {
        return driver.findElement(slipIndicator).isDisplayed();
    }

    public boolean isDataSavedToHistory() {
        return driver.findElement(historyIndicator).isDisplayed();
    }
}