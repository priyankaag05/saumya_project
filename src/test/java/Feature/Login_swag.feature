Feature: Swag labs Login Scenario

  Background: 
    Given I have launched the application

  @regression
  Scenario: Login into SwagLabs positive scenario
    When I entered correct username and password
    And I click on Login button
    Then I should land home page with title "Swag Labs"

  @Sanity
  Scenario: Login into SwagLabs negative scenario
    When I entered incorrect username and password
    And I click on Login button
    Then I should get the error message "Epic sadface: Sorry, this user has been locked out."

  Scenario Outline: Login into SwagLabs
    When I entered correct "<username>" and "<password>"
    And I click on Login button
    Then I should land home page with title "Swag Labs"

    Examples: 
      | username        | password     |
      | problem_user    | secret_sauce |
      | locked_out_user | secret_sauce |
