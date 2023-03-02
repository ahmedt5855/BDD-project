Feature: User Login
  I want to login with invalid credentials in orange website
  Scenario Outline:Error
    Given the user in the Login page to enter empty password
    When I entered empty password "<username>" ,"<password>"
    Then Empty password Error is Displayed
    Examples:
      | username | password |
      | Admin    |          |
      |          | sbhdjkbk |
      |          |          |