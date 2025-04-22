package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage;

    @Given("El usuario está en la página de subida de archivos")
    public void el_usuario_está_en_la_página_de_subida_de_archivos() {
        driver = // inicializar el controlador WebDriver aquí
        uploadPage = PageFactory.initElements(driver, tc_002Page.class);
        uploadPage.navigateToUploadPage();
    }

    @When("El usuario selecciona un archivo con formato válido y dentro del límite permitido")
    public void el_usuario_selecciona_un_archivo_con_formato_válido_y_dentro_del_límite_permitido() {
        String filePath = "path/to/valid/file.pdf"; // Ruta del archivo
        uploadPage.selectFile(filePath);
    }

    @Then("El archivo se carga y se muestra la vista previa con el nombre, tamaño y tipo")
    public void el_archivo_se_carga_y_se_muestra_la_vista_previa_con_el_nombre_tamaño_y_tipo() {
        Assert.assertTrue(uploadPage.isFilePreviewDisplayed());
        Assert.assertEquals("file.pdf", uploadPage.getFileName());
        Assert.assertEquals("PDF", uploadPage.getFileType());
        Assert.assertTrue(uploadPage.getFileSize() < 50 * 1024 * 1024); // Límite de 50 MB
    }
}