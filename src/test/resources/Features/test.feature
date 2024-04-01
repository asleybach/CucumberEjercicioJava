Feature: Google Search

  Scenario: Search for Automation on Google and capture Wikipedia screenshot
    Given user go to the Google search page
    When user search for "automation"
    Then user see search results for "automation"
    And user click the Wikipedia link for "Automation"
    And user capture a screenshot of the Wikipedia page
   
