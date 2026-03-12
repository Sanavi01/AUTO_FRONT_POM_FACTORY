Feature: Selección de mesa, eleccion de pedido y confirmación

  Scenario Outline: Cliente elige una mesa, realiza un pedido y recibe confirmación
    Given el cliente está en la pantalla de seleccion de mesa
    When selecciona la mesa "<mesa>" desde el menú
    And agrega una "<opcion_producto>" al pedido
    And aumenta "<veces_aumentar>" vez(ces) la cantidad de "<opcion_producto>"
    And disminuye "<veces_disminuir>" vez(ces) la cantidad de "<opcion_producto>"
    And confirma el pedido
    Then recibe la confirmación de que la cocina ha recibido el pedido


    Examples:
      | mesa | opcion_producto | veces_aumentar | veces_disminuir |
      | 5    | 4    | 3              | 1               |
      | 8    | 2          | 2              | 1               |
