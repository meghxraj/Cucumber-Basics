Feature: Example of passing data in Cucumber not Examples

  @DataTableList
  Scenario: Fetching data from datatable as Lists
    Given User has to so some task
    Then getting data from datatable below
      | megh  | test1 | 12345 | Mys |
      | pengu | test2 | 54321 | Blr |
    And this is not same as the example keyword

  @DataTableMap
  Scenario: Fetching data from datatable as Lists
    Given User has to so some task
    Then getting data from datatable below as Maps
      | name  | test  | id    | place |
      | megh  | test1 | 12345 | Mys   |
      | pengu | test2 | 54321 | Blr   |
    And this is not same as the example keyword
