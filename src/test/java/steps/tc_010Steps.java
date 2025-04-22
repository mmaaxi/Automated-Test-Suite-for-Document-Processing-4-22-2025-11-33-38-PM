package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Tc_010Page;

public class Tc_010Steps {
    Tc_010Page page = new Tc_010Page();

    @Given("el usuario ha accedido al sistema de gestión de solicitudes")
    public void elUsuarioHaAccedidoAlSistemaDeGestiónDeSolicitudes() {
        page.navigateToApplication();
    }

    @When("el usuario sube todos los documentos requeridos")
    public void elUsuarioSubeTodosLosDocumentosRequeridos() {
        page.uploadRequiredDocuments();
    }

    @When("el sistema procesa los documentos")
    public void elSistemaProcesaLosDocumentos() {
        page.processDocuments();
    }

    @Then("se genera el 'Slip de salida'")
    public void seGeneraElSlipDeSalida() {
        Assert.assertTrue("El 'Slip de salida' no fue generado", page.isSlipGenerated());
    }

    @Then("los documentos originales y los datos extraídos son guardados en el historial de la solicitud")
    public void losDocumentosOriginalesYLosDatosExtraídosSonGuardadosEnElHistorialDeLaSolicitud() {
        Assert.assertTrue("Los documentos y datos no fueron guardados en el historial", page.isDataSavedToHistory());
    }
}