Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given el usuario ha accedido al sistema de gestión de solicitudes
    When el usuario sube todos los documentos requeridos
    And el sistema procesa los documentos
    Then se genera el 'Slip de salida'
    And los documentos originales y los datos extraídos son guardados en el historial de la solicitud