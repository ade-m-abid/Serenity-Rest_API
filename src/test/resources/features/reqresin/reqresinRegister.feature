Feature: Register
  Scenario: User Successful POST Register
    When user success send POST register reques in reqresin
    Then respone status code should be 200
    And respone structure sould match json scema "Register.json"

  Scenario: User Unsuccessful POST register
    When user Unsuccess send POST register reques in reqresin
    Then respone status code should be 400
    And respone structure sould match json scema "unsuccessRegister.json"