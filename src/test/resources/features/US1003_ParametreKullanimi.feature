Feature: US kullanici testotomasyonu sayfasinda istedigi kelimeyi aratir.
  Scenario: TC07 Kullanici istedigi kelimeyi aratabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "baby" yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And 2 saniye bekler
    And sayfayi kapatir