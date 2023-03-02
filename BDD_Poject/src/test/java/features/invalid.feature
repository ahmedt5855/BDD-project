Feature: User Login
  I want to login with invalid credentials in orange website
  Scenario Outline:Error
    Given the user in the Login page invalid
    When I entered invalid "<username>" ,"<password>"
    Then Error is Displayed
    Examples:
      | username | password   |
      | Admin    | admin12387 |
      | Admin20  | admin123   |
      | Admin20  | admin1238  |