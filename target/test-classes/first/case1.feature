Feature: Registration

  @tag1
  Scenario: Register to TestMeApp
    Given user opens the TestMeApp
    And click on sign up
    When user enters username "Sam123" in the username field
    And user enters first name "Sam"
    And user enters last name "John"
    And user enters password "Sam123"
    And user enters confirm password "Sam123"
    When user selects the gender
    And user enters E-Mail "sam@gmail.com"
    And user enters Mobile Number "9840880444"
    When user enters dob "03/18/1998"
    And user enters Address "15,Gandhi nagar,Chennai"
    When user selects the Security Question
    And user enters Answer "Chennai"
    Then user clicks register button
   
 
