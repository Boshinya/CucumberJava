Feature: login to the Application
  Scenario: Given valid username and password should be able to login to the application.
    Given user am on LoginPage
    When user enter valid username
    And user enter valid password
    And user click on login button
    Then user should see the homepage