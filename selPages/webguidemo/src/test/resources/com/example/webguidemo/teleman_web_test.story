Scenario: User searches for a single step
 
Given user is on Home page
When user opens selected drama
Then Drama page is shown

When user opens explore drama
Then drama explore page is shown

Given user is on SingUp page
When user filled incorrectly form 
Then validation information is shown
Then sing in button is blocked
