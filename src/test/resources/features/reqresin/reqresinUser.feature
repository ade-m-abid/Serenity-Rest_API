Feature: User

  Scenario: User GET Singel User
    When user successful send Get singel user request in reqresin
    Then respone status code should be 200
    And respone structure sould match json scema "singelUser.json"

  Scenario: User GET List User Resource
    When user successful send Get List User resource request in reqresin
    Then respone status code should be 200
    And respone structure sould match json scema "listUserRe.json"

  Scenario: User CREATE New Account
    When user successful send Create new accont request in reqresin
    Then respone status code should be 201
    And respone structure sould match json scema "createAcc.json"

  Scenario: User PUT Update data
    When user successful send Put update data request in reqresin
    Then respone status code should be 200
    And respone structure sould match json scema "updateData.json"

 Scenario: User DELET Account
   When user successful send Delete accont request in reqresin
   Then respone status code should be 204
