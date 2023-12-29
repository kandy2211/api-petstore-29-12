@login
Feature: get username api automation
@test
  Scenario: Get username details get endpoint
    Given User add header
    When User send "GET" request for login endpoint
    Then User verify the status code is 200
    And User verify the login response body first_name present as "basha"

  @kk
  Scenario Outline: Create username with post endpoint
    Given User add headers
    When User add request body "<id>", "<username>","<firstName>","<lastName>", "<email>","<password>","<phone>" and "<userStatus>"
    And User send "POST" request for create endpoint
    Then User verify the status code is 200
    And User verify the message "unknown"

    Examples: 
      | id | username | firstName | lastName | email          | password | phone      | userStatus |
      |  5 | kanda21  | kk        | samy     | abcd@gmail.com |  1234567 | 1234567890 |          1 |

  @kkk
  Scenario Outline: place an order using post request
    Given User add headers
    When User add request body "<id>", "<petId>", "<quantity>", "<shipdate>", "<status>" and "<complete>"
    And User send "POST" request for id endpoint
    Then User verify the status code is 200
    And User verify the message orderplaced "15"

    Examples: 
      | id | petId | quantity | shipdate | status | complete |
      |  5 |   115 |       15 |     2009 | placed | true     |

  @22
  Scenario Outline: Add a new pet to the store
    Given User add headers
    When User add request bodys "<Id>", "<categoryId>", "<categoryname>","<name>", "<photo>", "<tag>" , "<status>" , "<tagid>" and "<Tagname>"
    And User send "POST" request for pet creation
    Then User verify the status code is 200
    And User verify the message

    Examples: 
      | Id | categoryId | categoryname | name | photo | tag  | status   | tagid | Tagname |
      |  5 |        115 | kandy        | url  |     0 | true | complete |   909 | kk      |
