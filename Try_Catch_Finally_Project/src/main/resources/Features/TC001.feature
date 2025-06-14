 Feature: Get post by ID

  Scenario: Get post with ID 1
    Given the API is up and running
    When I send a GET request to "/posts/1"
    Then the response status code should be 200
    And the response should contain "userId" and "title"
    









