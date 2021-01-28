Feature: US1015_DBUtils_ile_yapilan_sorgular
  Scenario: TC_23 kullanici tHOTEL tablosundan mail fieldini okur
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And kullanici DBUtils ile "tHOTEL" tablosundan "Mail" verilerini okur
    Then IDHotel degeri 5 olan kaydin Email bilgisinin "Mehemt" oldugunu test eder