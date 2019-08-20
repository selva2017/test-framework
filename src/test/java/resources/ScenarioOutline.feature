Feature: Sceanrio outline examples

Scenario: Data table without header
Given I open my application
And I login with following credentials 
| admin | pass1234 |
			
Scenario: Data table with header
Given I open Facebook URL
And fill up the new account form with the following data
| First Name | Last Name | Phone No   | Password | DOB Day  | DOB Month  | DOB Year  | Gender |
| Test FN 	 | Test LN 	 | 0123123123 | Pass1234 | 01 			| Jan 			 | 1990 		 | Male   |

Scenario: Create multiple new accounts in Facebook
Given I open Facebook URL and create new accounts with below data
| First Name | Last Name | Phone No   | Password | DOB Day  | DOB Month  | DOB Year  | Gender 	|
| Abc FN 	 | Abc LN 	 | 0123123123 | Pass1234 | 01 		| Jan 		 | 1990 	 | Male   	|
| Def FN 	 | Def LN 	 | 0456456456 | Abcd1234 | 01 		| Feb 		 | 1990 	 | Female   |
| Xyz FN 	 | Xyz LN 	 | 0789789789 | Pass2018 | 01 		| Mar 		 | 1990 	 | Female   |