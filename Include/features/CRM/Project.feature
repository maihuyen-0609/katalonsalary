Feature: Project management

  Scenario Outline: Add new project
    Given user login to system with email <email> and password <password>
    And user open project page
    When user click Add Project button
    Then the Add Project dialog is display
    When enter all data on field on Add Project form <title>, <client>, <description>, <start date>, <deadline>, <price>, <labels>
    And user click Save button
    Then all data just added is correct <title>, <client>, <description>, <start date>, <deadline>, <price>, <labels>
    Then the project just added shall display at project dropdown on Add Task dialog <title>

    Examples: 
      | email          | password | title | Client | Description | Start date | deadline   | price | labels      |
      | admin@demo.com | riseDemo | Test1 | Mina   | None        | 22-07-2022 | 30-07-2022 |   300 | Open Source |
