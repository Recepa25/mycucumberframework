Feature: US1010_Ck_Hotels_farkli_kullanici_deneme


  #kullanici ve sifre parametreli olacak
  Scenario: TC12_farkli_kullanici_isim_ve_sifre_yazarak_deneyebimeliyim
    When kullanici "Ck_Hotels_Url" anasayfaya gider
    Then Log in yazisina tiklar
    And username olarak "Manager1" girer
    And password olarak "Manager1" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder

    #coklu deger girerek test yapalim
  Scenario Outline:TC13_coklu_kullanici_isim_ve_sifre_yazarak_deneyebimeliyim
    When kullanici "Ck_Hotels_Url" anasayfaya gider
    Then Log in yazisina tiklar
    And username olarak "<username>" girer
    And password olarak "<sifre>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    Examples:
      | username | sifre    |
      | Manager  | Manager  |
      | Manager1 | Manager1 |
      | Manager2 | Manager2 |
      | Manager3 | Manager3 |