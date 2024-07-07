Feature: US1002 Kullanici scenario baslarindaki ortak adimlari Backgrouns ile kullanabilir
  Background: anasayfaya gitme


    Given kullanici testotomasyonu anasayfaya gider


  Scenario: TC04 Kullanici sitede phone aratabilmeli


    When arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC05 Kullanici sitede samsung aratabilmeli

    When arama kutusuna samsung yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir