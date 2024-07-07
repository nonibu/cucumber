Feature: US 5005 Jack Jones
  Scenario : TC01
    Given kullanici "jackUrl" anasayfaya gider
    Then "cookies accept" cookies kabul eder
    Then arama kutusuna "dress" yazip aratir
    And sayfayi kapatir

