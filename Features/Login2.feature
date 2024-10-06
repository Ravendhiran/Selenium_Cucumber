Feature: Validate the Login with valid credentials and invalid credentials

	@Smoke	
  Scenario: Successful Login with valid credentials
    #Given User navigates to the login page
    Given User enter the email address "ravendhiran04@gmail.com" and password "Ravi@5391"
    When User click on the Login button
    Then User should navigates to the Homepage
	
#	@Smoke
 # Scenario Outline: Login with invalid credentials
   # Given User navigates to the login page
  #  Given User enter the email address "ravi@gmail.com" and password "Ravi@5391"
   # When User click on the Login button
    #Then User should not navigates to the Homepage and validate the error message
