Feature: POST Login

  Scenario: User Successful POST Login
    When user success send POST login reques in reqresin
    Then respone status code should be 200
    And respone structure sould match json scema "login.json"

  Scenario: User Unsuccessful POST Login
    When user Unsuccess send POST login reques in reqresin
    Then respone status code should be 400
    And respone structure sould match json scema "fieldLogin.json"