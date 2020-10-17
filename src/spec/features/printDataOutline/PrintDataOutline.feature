@print-data
Feature: Print Data - Text Box
  As a user i want to print my data

  @outline
  Scenario Outline: Print Data - Text Box
    Given I open application text box
    When I want to print full name "<fullName>"
    And I want to print email "<email>" 

    Examples: 
      | fullName | email            |
      | Achref   | achref@gmail.com |
      | Mariem   | mariem@gmail.com |
