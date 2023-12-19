public class Order {
    private String tableNumber;
    private String dishes;
    private double totalCost;
    private String orderTime;

    public Order(String tableNumber, String dishes, double totalCost, String orderTime) {
        this.tableNumber = tableNumber;
        this.dishes = dishes;
        this.totalCost = totalCost;
        this.orderTime = orderTime;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public String getDishes() {
        return dishes;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getOrderTime() {
        return orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "tableNumber='" + tableNumber + '\'' +
                ", dishes='" + dishes + '\'' +
                ", totalCost=" + totalCost +
                ", orderTime='" + orderTime + '\'' +
                '}';
    }
}