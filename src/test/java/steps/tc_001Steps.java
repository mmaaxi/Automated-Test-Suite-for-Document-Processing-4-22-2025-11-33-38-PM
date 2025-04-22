package steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        driver = // configuración del WebDriver
        page = PageFactory.initElements(driver, tc_001Page.class);
        driver.get("URL de la página de carga de documentos");
    }

    @When("selecciona la opción 'cargar documentos'")
    public void selecciona_opcion_cargar_documentos() {
        page.clickCargarDocumentos();
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opcion_para_carga_unica_y_carga_multiple() {
        assertTrue(page.isCargaUnicaVisible());
        assertTrue(page.isCargaMultipleVisible());
    }

    @When("elige 'carga en un solo archivo'")
    public void elige_carga_en_un_solo_archivo() {
        page.selectCargaUnica();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_unico_recuadro_para_subir_el_archivo() {
        assertTrue(page.isRecuadroCargaUnicaVisible());
    }

    @When("elige 'cargar documentos por separado'")
    public void elige_cargar_documentos_por_separado() {
        page.selectCargaMultiple();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_multiples_recuadros_para_documentos_requeridos() {
        assertTrue(page.areRecuadrosCargaMultipleVisible());
    }
}