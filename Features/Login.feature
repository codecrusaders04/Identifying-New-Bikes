#Feature: User Login

  #Scenario: Validate the Login page
    #Given the user is on the Home page
    #When the user click the login page
    #Then the user navigate to the Login page
#
  #Scenario: Validate the Email text Box
    #Given the user is on the Home page
    #When the user click the login page
    #Then the user should see the email text box
#
  #Scenario: Login with special Character
    #Given the user is on the Home page
    #When the user click the login page
    #And the user enters invalid credential(email:"'/@gmail.com")
    #And the user clicks on the login button
    #Then the user should get a error message
#
  #Scenario: Login with invalid credential
    #Given the user is on the Home page
    #When the user click the login page
    #And the user enters invalid credential(email:"893@gmail.com")
    #And the user clicks on the login button
    #Then the user should get a error message
#
  #Scenario: Login with blank credential
    #Given the user is on the Home page
    #When the user click the login page
    #And the user enters invalid credential(email:" ")
    #And the user clicks on the login button
    #Then the user should get a error message
    
 Feature: Login Basic Functionality Checking 
 
		Scenario: Validating Login button
		Given the user is on the Home Page
		When the user clicks on Login button
		Then the user can able to see the Login/Register pop-up
		
		Scenario: Validating Google button
		Given the user is on the Login/Register pop-up
		When the user clicks on Google button
		Then the user is able to navigate to Google Account Page
		
		Scenario: Validating the email text box
		Given the user is on Google Account Page
		When the user clicks on the email text box 
		Then the user can able to send keys in the email text box
		
		  
		
		
		
    
    
