
## Статистика - очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].

Вам поручили написать небольшой сервис (программисты все заняты), который умеет рассчитывать:

Сумму всех продаж
Среднюю сумму продаж в месяц
Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
Примечание:* внимательно посмотрите на данные о продажах и подумайте, какая здесь может быть ловушка 😈.

Подсказка
Идея: чтобы сосчитать номер месяца вы можете создать переменную, которую будете увеличивать на каждой итерации цикла. Таким образом, в этой переменной будет храниться номер месяца (см. спойлер).

Спойлер
Вам необходимо:

Создать Maven проект, в котором в package ru.netology.stats будет класс StatsService с необходимыми методами (сами придумайте им говорящие названия*)
Написать на каждый метод по одному автотесту, который проверяет правильность работы на тестовых данных**
Убедитесь, что ваши автотесты работают и проходят (для этого пробуйте "ронять" каждый свой тест и удостоверяйтесь, что он действительно падает).
Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и автотесты к нему.

Примечание:* имена методов с маленькой буквы, на правильном английском без транслитерации и сокращений. Не должно быть никаких f, calc1, cMin и т.д. В то же время перебарщивать тоже не надо: findMonthIndexWithMinimumTotalAmountOfPurchases не есть хорошо.

Примечание:** тестируйте в первую очередь на выданных вам данных, т.к. если на выданных вам данных приложение работает неправильно, то уже всё равно, как оно работает на других данных.

Важно: старайтесь отвыкать от создания класса Main и проверки работы приложения через него. Помните, что для проверки у вас есть Maven и автотесты.