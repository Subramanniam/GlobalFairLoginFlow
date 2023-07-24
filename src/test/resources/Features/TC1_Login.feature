Feature: Verify Global Fair Application Login Page

  Scenario Outline: Validate Login Page with valid credentials
    Given User is on Global Fair Home Page
    When User click on navigation menu and click on Login Button
    And User enters "<emailId>" and click on sign in Button
    And User enters "<otp>" and verify Button
    Then login should be success

    Examples: 
      | emailId     | otp   |
      | test@gf.com | 88745 |
