Feature: Create new account and execute actions with it

    Scenario: User create new account

    When click the button "Войти"

    Then Check content "Регистрация" visibility
#    Когда видем надпись "Регистрация"

    Then Click on "Соискателя" button
#    То жмем на кнопку "Соискателя"

    Then Check "Регистрация соискателя" visibility
#    Когда видем надпись "Регистрация соискателя"

    And Input name
#    То вводим наше имя

    And Input lastname
#    И вводим фамилию

    And Input email or phone number
#    И вводим email

    And Click "Зарегистрироваться" button
#    И жмем кнопку на "Зарегистрироваться"


