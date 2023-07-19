#Author: ankurdave91@gmail.com	
#Keywords Summary : 
#Feature: 
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@all
Feature: Google Search Feature 
	As a User I would like to perform Google Search for iPhone 14 

  @SmokeTest
  Scenario: Perform a Google Search
    Given User is able to launch Google Chrome
    And User is able to access Search Text Box
    When User enters inofmration in search box
    And User hits Search button
    Then User is able to navigate to Search Page Result

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
