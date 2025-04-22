package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    By fileInput = By.id("file-upload-input");
    By filePreview = By.id("file-preview");
    By fileName = By.id("file-name");
    By fileType = By.id("file-type");
    By fileSize = By.id("file-size");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectFile(String filePath) {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isFilePreviewDisplayed() {
        return driver.findElement(filePreview).isDisplayed();
    }

    public String getFileName() {
        return driver.findElement(fileName).getText();
    }

    public String getFileType() {
        return driver.findElement(fileType).getText();
    }

    public long getFileSize() {
        String sizeText = driver.findElement(fileSize).getText();
        return Long.parseLong(sizeText.replace(" MB", "").trim()) * 1024 * 1024; // Convert MB to bytes
    }
}