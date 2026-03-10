Feature: Reserva de mesa

  Scenario: Reservar una mesa con éxito
    Given el cliente está en la página de reservas
    When solicita reservar una mesa para 2 personas
    Then la reserva se confirma
