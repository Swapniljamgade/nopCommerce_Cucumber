Feature:Login

Scenario: Sucessful Login with Valid Credentials
    Given User Launch chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Click on Log Out link
    Then Page Title should be "Your store. Login"
    And close browser