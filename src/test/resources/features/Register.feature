Feature: Register user

  @RegisterUser
  Scenario Outline: Registering user on app

    Given I open "<url>"
    When Click on "Register"
    And Set Input "" with value ""
    And Click on Button ""

    Examples:
      | url      |
      | parasoft |