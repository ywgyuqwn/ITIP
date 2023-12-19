public class Restaurant {
    public static void main(String[] args) {
        HashTable<String, Order> orderTable = new HashTable<>(10);

        // Вставка заказов
        Order order1 = new Order("Table 1", "Pasta, Salad", 25.0, "2023-10-25 18:30:00");
        orderTable.put(order1.getTableNumber(), order1);

        Order order2 = new Order("Table 2", "Steak, Dessert", 40.0, "2023-10-25 19:15:00");
        orderTable.put(order2.getTableNumber(), order2);

        // Поиск заказа по номеру столика
        String tableNumber = "Table 1";
        Order foundOrder = orderTable.get(tableNumber);
        if (foundOrder != null) {
            System.out.println("Order found: " + foundOrder);
        } else {
            System.out.println("Order not found for table number: " + tableNumber);
        }

        // Удаление заказа по номеру столика
        String tableNumberToRemove = "Table 2";
        orderTable.remove(tableNumberToRemove);

        // Проверка количества заказов и наличия пустой таблицы
        System.out.println("Number of orders: " + orderTable.size());
        System.out.println("Is order table empty: " + orderTable.isEmpty());
    }
}