Feature: Selección de mesa, elección de pedido y confirmación

  Scenario Outline: Cliente elige una mesa, realiza un pedido y recibe confirmación
    Given el cliente está en la pantalla de selección de mesa
    When selecciona la mesa "<mesa>" desde el menú
    And agrega la opción "<opcion_producto>" al pedido
    And aumenta "<veces_aumentar>" vez(ces) la cantidad de la opción "<opcion_producto>"
    And disminuye "<veces_disminuir>" vez(ces) la cantidad de la opción "<opcion_producto>"
    And hace click en Comprar
    And confirma el pedido desde el carrito
    Then recibe la confirmación de que la cocina ha recibido el pedido

    Examples:
      | mesa | opcion_producto | veces_aumentar | veces_disminuir |
      | 5    | 4               | 3              | 1               |
      | 8    | 2               | 2              | 1               |
      | 2    | 1               | 4              | 2              |