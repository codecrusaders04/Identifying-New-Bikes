#Feature: Login Data Driven with Excel
#
#@sanity
#Scenario Outline: Login with special character
#Given the user is on Google Account Page
#When the user clicks on the Email text box
#And the user enters the special character email with the excel row "<row_index>"
#Then the user should get a error message
#
#Examples:
#| row_index |
#|         1 |
#@regression
#Scenario Outline: Login with invalid credential
#Given the user is on Google Account Page
#When the user clicks on the Email text box
#And the user enters the invalid credential email with the excel row "<row_index>"
#Then the user should get a error message
#
#Examples:
#| row_index |
#|         2 |
#@regression
#Scenario Outline: Login with blank email
#Given the user is on Google Account Page
#When the user clicks on the Email text box
#And the user enters the blank email with the excel row "<row_index>"
#Then the user should get a error message
#
#Examples:
#| row_index |
#|         3 |
#
#@sanity
#Scenario Outline: Login with numberic values
#Given the user is on Google Account Page
#When the user clicks on the Email text box
#And the user enters the numeric value with the excel row "<row_index>"
#Then the user should get a error message
#
#Examples:
#| row_index |
#|         4 |
#
#@sanity
#Scenario Outline: Login with only string characters
#Given the user is on Google Account Page
#When the user clicks on the Email text box
#And the user enters the string characters with the excel row "<row_index>"
#Then the user should get a error message
#
#Examples:
#| row_index |
#|         5 |
Feature: Login Data Driven with Excel

  @regression
  Scenario Outline: Login with invalid credential
    Given the user is on Google Account Page
    When the user clicks on the Email text box
    And the user enters the invalid credential email with the excel row "<row_index>"
    Then the user should get a error message with the excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
