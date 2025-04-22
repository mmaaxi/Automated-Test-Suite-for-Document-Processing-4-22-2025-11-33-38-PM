Feature: Validar selección de modo de carga de documentos

  Scenario: Seleccionar modo de carga de documentos
    Given el usuario está en la página de carga de documentos
    When selecciona la opción 'cargar documentos'
    Then el sistema muestra opción para carga única y carga múltiple
    
    When elige 'carga en un solo archivo'
    Then se habilita un único recuadro para subir el archivo
    
    When elige 'cargar documentos por separado'
    Then se muestran múltiples recuadros correspondientes a cada documento requerido