Feature: Us
  Scenario: kil
    When kullanici "WT" anasayfaya gider
    Then 2 saniye bekler
    And cookies kabul ederler
    Then HomePage click
    And Homepage Right click
    Then Menu click
    And Menu Right click
    Then click Special
    And ilk urunun  sayfasina gider
    Then Location adresi yaz ve Enter bas


