Feature: Create new account and execute actions with it

  Scenario: Login with entered during registration data

    When click the button "Войти"
    Then Check content "Регистрация" visibility
    Then Input email or phone number
    And input password
    And click "Войти" button
    And Check content "Найди работу мечты" visibility
    Then click profile button
    And Check user name visibility


