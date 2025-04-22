Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir un archivo en formato PDF/DOCX dentro del límite de 50 MB
    Given El usuario está en la página de subida de archivos
    When El usuario selecciona un archivo con formato válido y dentro del límite permitido
    Then El archivo se carga y se muestra la vista previa con el nombre, tamaño y tipo