#http://automationpractice.com/index.php sayfasina gidelim
#Cucumber ile asagidaki testi yapalim
#        Given user web sayfasinda
#        And user sign in linkine tiklar
#        And user Create and account bölümüne email adresi girer
#        And Create an Account butonuna basar
#        And user kisisel bilgilerini ve iletisim bilgilerini girer
#        And user Register butonuna basar
#        Then hesap olustugunu dogrulayin

Feature: US1011_AutomationPractice
#@wip
  Scenario: TC14_Kullanici_yeni_giris_olusturabilmeli
    When kullanici "Ap_url" anasayfaya gider
    Then Ap sign_in tusuna tiklar
    And ap email kutusuna email bilgisi yazar
    And ap create an account tusuna basar
    And ap cinsiyet secer
    And ap isim girer
    And ap soyisim girer
    And ap password girer
    And pagedown tusuna basar
    And "1" saniye bekler
    And ap gun secer
    And ap ay secer
    And ap yil secer
    And ap adres isim yazar
    And ap adres soyisim yazar
    And ap sirket ismi yazar
    And ap adress yazar
    And ap adress2 yazar
    And ap adres sehir yazar
    And ap state dropdown secer
    And ap adres zip kod yazar
    And pagedown tusuna basar
    And "1" saniye bekler
    And ap country dropdown secer
    And bilgi ekleme yapar
    And home phone yazar
    And reference alanini temizler
    And reference yazar
    And ap register butonuna basar


  @automation
    #http://automationpractice.com/index.php sayfasina gidelim
    #Cucumber ile asagidaki testi yapalim
    #        -   Given user web sayfasinda
    #        -   And user sign in linkine tiklar
    #        -   And email kutusuna @ iaseti olmayan  e-email adresi yazar ve enter'a tiklar
    #        - Then error mesajinin Authentication failed. oldugunu dogrulayin
  Scenario: TC_15_Yanlis_mail_ile_giris_yapilamaz
  When kullanici "Ap_url" anasayfaya gider
    Then Ap sign_in tusuna tiklar
    And ap email kutusuna invalid e-mail bilgisi yazar ve enter'a tiklar
    And ap create an account tusuna basar
    And ap hata mesaji kisminda hata mesajini dogrular