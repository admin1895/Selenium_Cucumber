Feature: Login

  Scenario Outline: Successful Login with Valid Credentials
    Given User Launch Firefox browser
    When User open URL <url>
    Then User enters Email as <emailadd> and Password as <password>
    And Click on Login
    Then Page Title should be <title>
    When User click on Log Out link
    Then Page Title should be <title1>
    And close browser
    Examples:
      | url                                        | emailadd              | password | title                                    | title1              |
      | "https://admin-demo.nopcommerce.com/login" | "admin@yourstore.com" | "admin"  | "Dashboard / nopCommerce administration" | "Your store. Login" |