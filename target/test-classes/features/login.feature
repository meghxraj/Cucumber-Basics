Feature: Login to Facebook

@Test
Scenario: Happy path login 
Given User has opened Facebook page
When user logs in with "username" and "password"
Then dashboard is diaplayed
And other details are shown

	
@test1
Scenario Outline: Happy path login 
Given User has opened Facebook page
When user logs in with "username" and "password"
Then dashboard is diaplayed
And other details are shown

Examples:
	|username | password |
	|test     | pwd      |

