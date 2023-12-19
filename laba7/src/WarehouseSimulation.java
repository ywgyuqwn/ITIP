import java.util.concurrent.atomic.AtomicInteger;

public class WarehouseSimulation {
    static class Item {
        private int weight;

        public Item(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    static class Warehouse {
        private AtomicInteger currentLoad = new AtomicInteger(0);
        private static final int MAX_LOAD = 150;

        public void addItem(Item item) throws InterruptedException {
            while (currentLoad.get() + item.getWeight() > MAX_LOAD) {
                Thread.sleep(100); // ожидание освобождения места
            }
            currentLoad.addAndGet(item.getWeight());
        }

        public void removeItems() {
            currentLoad.set(0);
        }
    }

    static class Worker extends Thread {
        private Warehouse warehouse;
        private Item item;

        public Worker(Warehouse warehouse, Item item) {
            this.warehouse = warehouse;
            this.item = item;
        }

        @Override
        public void run() {
            try {
                warehouse.addItem(item);
                System.out.println("Item added: " + item.getWeight() + " kg");
                // представление доставки
                Thread.sleep(500);
                warehouse.removeItems();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Item[] items = { /* инициализация товаров */ };

        for (Item item : items) {
            new Worker(warehouse, item).start();
        }
    }
}//каждый грузчик представлен потоком Worker, который переносит товары на склад.
// Склад контролирует общий вес товаров, не допуская его превышения установленного предела.