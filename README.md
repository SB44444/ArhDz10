https://github.com/SB44444/ArhDz10.git
**Архитектура ПО (семинары)**
*
*Урок 10. Структура приложения с пользовательским интерфейсом и базой данных*
Вы можете реализовать эти патерны, в рамках своего проекта, к которому Вы делали диаграммы и таблицы. Или реализовать отдельно от них.
Домашнее задание: Реализация паттернов Агрегатор, Репозиторий и Кеширования
Цель: Освоить принципы работы и применение трёх ключевых паттернов проектирования: Агрегатор, Репозиторий и Кеширование.

Часть 1: Паттерн Агрегатор.
Реализуйте классы Order, OrderItem и Product.
Order должен содержать список OrderItem, каждый из которых содержит Product и количество этого продукта.
У каждого заказа должен быть метод для расчета общей стоимости.
Часть 2: Паттерн Репозиторий.
Создайте интерфейс OrderRepository, который определяет методы для работы с заказами (сохранение, загрузка по ID, загрузка всех заказов и т. д.).
Реализуйте класс OrderRepositoryImpl, который реализует данный интерфейс, используя любую базу данных на ваш выбор (может быть встроенной, например, SQLite).
В репозитории обеспечьте сохранение и загрузку заказов, а также всех связанных с ними объектов (OrderItem, Product).
Часть 3: Паттерн Кеширования.
Исследуйте и выберите одну из библиотек для кеширования в Java (например, EhCache, Caffeine или Guava Cache).
Реализуйте кеширование в вашем репозитории таким образом, чтобы часто запрашиваемые заказы загружались из кэша, а не из базы данных.
Обеспечьте инвалидацию кэша (обновление данных в кэше), если информация в базе данных была изменена.
Дополнительное задание:
Реализуйте пользовательский интерфейс (может быть консольным или графическим), чтобы демонстрировать создание, редактирование, загрузку и удаление заказов.
Добавьте возможность фильтрации и сортировки заказов при их загрузке из базы данных.
Советы:

Соблюдайте принципы SOLID при проектировании и реализации вашего приложения.
Обрабатывайте все возможные исключения, особенно при работе с базой данных.
Подумайте над оптимальной стратегией кеширования в зависимости от предполагаемого объема данных и частоты запросов.
Это задание предполагает разработку приложения с использованием трёх ключевых паттернов.

Реализация: Задание выполнено с учетом принципы SOLID и предполагает возможность развития.
Паттерн Кеширования реализован отдельно, поскольку количество продуктов пиццерии редко превышает 10-ти видов,
использование кеширования не целесообразно. Однако в реализации используется общий класс продукты, что позволит при необходимости
подключить кеширование.
