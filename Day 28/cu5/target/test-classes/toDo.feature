@tag1

Feature: Acces to the website

Background: Verify the accessibility to the website todos
Given browser is open
When user put the link of the website
Then show homepage

@tag2


Scenario: Verify that the user can create a to do list
Given learn bar is shown
When user write what you needs to be done
And hits enter
Then the element is added to the To dos list