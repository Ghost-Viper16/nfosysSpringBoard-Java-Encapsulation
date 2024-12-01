class Order
{
    private int orderId;
    private String orderedFood;
    private double totalPrice;
    private String status;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderedFood() {
        return orderedFood;
    }

    public void setOrderedFood(String orderedFood) {
        this.orderedFood = orderedFood;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order()
    {

        System.out.println("Status of order 1 : Ordered");
    }

    public Order(int orderId, String orderedFood)
    {
        System.out.println("Status of order 2: Ordered");
        System.out.println("Id of order: "+ orderId);
        System.out.println("Item ordered in order 2: "+ orderedFood);
    }
    public double calculateTotalPrice(int unitPrice)
    {
        this.totalPrice = unitPrice * 1.05;
        return this.totalPrice;
    }
}
public class FoodOrder {
    public static void main (String[] ards)
    {
        Order od = new Order();
        Order od1 = new Order(1001, "Garlic Naan + Kadai Paneer");
        od.setOrderId(101);
        od.setOrderedFood("bringal lahshun");
        od.setStatus("Ordered");
        System.out.println(od.calculateTotalPrice(100));


    }
}
