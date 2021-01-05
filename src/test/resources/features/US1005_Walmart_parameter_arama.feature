@smoke
Feature: US1005_Walmart_parameter_arama

  Scenario Outline: TC07_aranan_kelime_title’da_olmali

    When kullanici walmart anasayfaya gider
    Then walmart sayfasinda "<arananlar>" icin arama yapar
    And walmart sayfa basliginin "<arananlar>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
      | arananlar |
      | Nutella   |
      | pencil    |
      | tomatoes  |
      | popcorn   |