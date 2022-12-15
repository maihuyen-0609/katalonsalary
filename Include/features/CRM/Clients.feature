Feature: Clients management

Scenario Outline: Add Client
    Given: user open system and login with username <email> and password <password>

    And user select Clients menu
    When user click Add Client button
    Then the Add Client dialog is display
    When user fill all data in the add client dialog: <company><owner><address><city><state>
    And click Save button
    And user click Clients tab to open Clients section
    Then the Client shall saved on Clients section
    When the user click Project menu
    And open Add Project dialog
    Then the Client just created shall display on Client dropdown list
Examples:
      | email          | password |company|owner|address|city|state
      | admin@demo.com |   123456 |Minatest|mina|HCM|HCM|HCM
      