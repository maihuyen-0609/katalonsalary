Feature: Permission

  Scenario Outline: Add Permission
    Given login to system with email <email> and password <password>
    And user open permission page
    When user click Add Permission button
    Then the Add Permission dialog is display
    When enter all data on field on Add Permission form <name>, <permissionname>, <remark>
    And user click Save button
    Then all data just added is correct <name>, <permissionname>, <remark>
    Then the success popup display

    Examples: 
      | email | password | name  | permissionname | remark |
      | admin |   123456 | Mina2 | Mina2          | Mina2  |
