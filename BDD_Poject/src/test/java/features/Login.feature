Feature: User Login
  I want to login with valid credentials in orange website
  Scenario Outline: User Login
    Given the user in the Login page
    When I entered "<username>" ,"<password>"
    Then The Home page is displayed
    Then I logout from the page
    Examples:
      | username | password |
      | Admin    | admin123 |