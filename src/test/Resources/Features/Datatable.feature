Feature: Learn data table
  Scenario: Cucumber Data Table
    Given Table with two rows and multiple columns as Maps
      | columnA | columnB | columnC | columnD |
      | value1  | value2  | value3  | value4  |
      | value5  | value6  | value7  | value8  |
     When Other Table with two rows and multiple columns as lists
      | columnA | columnB | columnC | columnD |
      | value1  | value2  | value3  | value4  |
      | value5  | value6  | value7  | value8  |
    When I Enter My Regular Expenses
      | name        | amount | frequency     |
      | Electricity |   5500 | Monthly       |
      | Water       |    900 | Weekly        |
      | Internet    |   1900 | Every 2 Weeks |
      | Cable TV    |    555 | Daily         |
    And Table with two rows and multiple columns as Map
      | UserName1 | columnB |
      | Password  | value2  |
      | userName2 | value6  |
      | Passw0rd2 | value8  |