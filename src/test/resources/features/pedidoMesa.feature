Feature: Reserva de mesa y envío directo a cocina

  Scenario Outline: Cliente identifica su mesa, realiza un pedido y recibe confirmación
    Given el cliente está en la pantalla de inicio del menú
    When selecciona la mesa "<mesa>" desde el menú
    And modifica "<cantidad>" unidad(es) de "<producto>" al pedido
    And confirma la compra del pedido
    Then recibe la confirmación de que la cocina ha recibido el pedido

  Examples:
    | mesa   | producto           | cantidad |
    | Mesa 5 | Pizza Margarita    | 2        |
    | Mesa 10| Ensalada César     | 1        |
