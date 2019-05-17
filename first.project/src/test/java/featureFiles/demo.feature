Feature: As a register user I can search fligts by using capital alphabets

  Background: Open website
    Given navigate to http://thomascook.com

  Scenario: Verify that the user can search flights by using only capiital alphabets
    Given as a user I enter "SOUTHAMPTON" in search box From
    When I press "Enter"
    Then I should see "Southampton" in the search box
