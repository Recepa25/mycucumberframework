@amazon
Feature: US1001 Amazon_Search_Page


  Scenario: TC01 amazon arama testi
    Given kullanici amazon anasayfaya gider
    And iphone icin arama yapar
    Then sonucun iphone icerdigini test eder

    Given kullanici amazon anasayfaya gider
    And teapot icin arama yapar
    Then sonucun teapot icerdigini test eder

    Given kullanici amazon anasayfaya gider
    And flower icin arama yapar
    Then sonucun flower icerdigini test eder
    And kullanici sayfayi kapatir