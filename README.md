#SilkPay test project 
В этом проекте учитывались все основные требования как:

1.1. Разработка должна быть выполнена на языке Java с использованием Spring Boot.

1.2. Должна быть реализована база данных (можно использовать in-memory базу
данных, такую как H2).(В моем проекте было использована PostgreSql)

1.3. Проект должен быть доступен для клонирования из репозитория на Github.

1.4. Используйте Maven или Gradle для сборки проекта.

1.5. Код должен соответствовать принципам SOLID.

1.6. Напишите unit-тесты для основной бизнес-логики.

1.7. Напишите интеграционные тесты для проверки взаимодействия между
компонентами системы.


Клонируйте репозиторий:git clone https://github.com/your-username/silkpay-microservice.git

Как запутите нужен будет постман где будем проверять работает ли наши запросы.

1.http://localhost:8001/accounts 

как запускаем код открываем постман указываем этот url: http://localhost:8001/accounts get запросом чтобы вывел все аккаунты со всеми данными

http://localhost:8001/accounts/1

поиск по id url: http://localhost:8001/accounts/1 */

2.http://localhost:8001/accounts/balance/000-003

поиск по accountNumber где показывает только счет данного accountNumber пример url:http://localhost:8001/accounts/balance/000-003

3.http://localhost:8001/accounts/createAcc

Также в постмане с post запросом можем добавить новый акканут  заходим в raw, json(с возможностью указать начальный баланс) пример заполнения { "accountNumber": "000-004", "balance": 444444.00 }

Пример заполнения Raw:Json можем не указывать id так как id у нас сам заполняется 
{
    "accountNumber": "000-003",
    "balance": 333333.00
}

4.http://localhost:8001/accounts/1/transfer/2?amount=100.00

Перевод между счетами где указываем первым id с какого счета переводим и дальше склько будем переводить а вторым id показываем счет получателя пример url: http://localhost:8001/accounts/1/transfer/2?amount=1000000.000 после вопросительного знака, это указывает на начало секции параметров запроса
