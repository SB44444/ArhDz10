
import agrigator.Order;
import agrigator.OrderItem;
import repository.OrderRepositoryImpl;
import repository.OrderRepository;
import entity.Product;

import java.sql.SQLException;


public class Main2 {

    public static void main(String[] args) {
        try {
            // Инициализация репозитория и базы данных.
            OrderRepositoryImpl productMenu = new OrderRepositoryImpl("jdbc:sqlite:shop.db");

            // Создание экземпляра заказа.
            OrderRepository service = new OrderRepository(productMenu);

            // Создание и инициализация продукта.
            Product product = new Product(1, "Пицца - Peyronie's", 10.0);
            Product product2 = new Product(2, "Пицца - light", 8.0);
            Product product3 = new Product(3, "Пицца - Chile", 12.0);

            // Создание нового заказа.
            Order order = new Order();

            // Добавление продукта в заказ.
            OrderItem orderItem = new OrderItem(product,2);
            order.addItem(orderItem);
            OrderItem orderItem2 = new OrderItem(product2,1);
            order.addItem(orderItem2);
            OrderItem orderItem3 = new OrderItem(product3,2);
            order.addItem(orderItem3);

            // Сохранение заказа в базе данных.
            service.createOrder(order);

            // Получение и вывод последнего заказа из базы данных.
            Order lastOrder = productMenu.getLastOrder();
            if (lastOrder != null) {
                System.out.println("Последний сохраненный заказ:");
                System.out.println(lastOrder);
            } else {
                System.out.println("В базе данных нет заказов.");
            }

        } catch (SQLException e) {
            // Обработка исключений, связанных с работой базы данных.
            e.printStackTrace();
        }
    }
}