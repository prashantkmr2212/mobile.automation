Feature: Ebay Login flow for existing customer

Scenario Outline:Verify Login for the user
  Given I launch ebay app on device "<deviceName>", "<platformName>", "<platformVersion>"
  When I click on sign in button
  Then I verify sign in with google option is displayed
  #And I login to ebay with "<username> and "<password>"

  Examples:
  |deviceName | platformName | platformVersion|
  |Samsung S10| Android      | 10             |
