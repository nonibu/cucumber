Feature: US1005 kullanici gecersiz bilgilerle giris yapamaz
  Scenario: TC09 Kullanici gecersiz password ile giris yapamamali
    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    When email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    And signIn butonuna basar
    Then giris yapilamadigini test eder
    And 2 saniye bekler
    And sayfayi kapatir