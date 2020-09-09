Feature: Create new account and execute actions with it

  Scenario: Get the forgotten password

#    When click the button "Войти"
#    Then Click on "Получить пароль" button
#    And Check content "Введите email или номер" visibility
#    Then Input email or phone number
#    And Click "Задать пароль" button
#    And Click "Проверить почту на mail.ru"

    And Check content "Войти в аккаунт" visibility
    When input account name
    And click "Ввести пароль" button
    And Check content "Введите пароль" visibility
    And input password
    And click "Войти" button
    And Should see on page "Ваш пароль на hh.ru"

