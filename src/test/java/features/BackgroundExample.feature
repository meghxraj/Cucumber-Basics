Feature: Useage of Background keyword in Cucumber

Background:
Given Open to facebook page
Then Navigate to feed tab

@Testing @Test
Scenario Outline:
Then Login using <username> and <password>
And verify if the title is displayed
Then navigate to <pagename> page
And perform some action

Examples:
| username | password | pagename |
| test 1   | testpwd  | home     |


@Testing @Smoke
Scenario Outline:
Then Login using <username> and <password>
And verify if the title is displayed
Then navigate to <pagename> page
And perform some action

Examples:
| username | password | pagename |
| test 2   | testpwd  | feed     |