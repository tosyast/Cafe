import java.util.ArrayList;
import java.util.List;
//Класс Кафейня(меню и заказы)
public class Cafe {
    private List<Coffee> menu;
    private List<Order> orders;
   public Cafe() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }
    public void addToMenu(Coffee coffee) {
        menu.add(coffee);
    }
    public List<Coffee> getMenu() {
        return menu;
    }
   public void placeOrder(Order order) {
        orders.add(order);
    }
  public List<Order> getOrders() {
        return orders;
    }
    public double getTotalRevenue() {
        double totalRevenue = 0;
        for (Order order : orders) {
            totalRevenue += order.getTotalPrice();
        }
        return totalRevenue;
    }
    public List<Coffee> getCoffeesByType(String type) {
        List<Coffee> result = new ArrayList<>();
        for (Coffee coffee : menu) {
            if (coffee.getType().equals(type)) {
                result.add(coffee);
            }
        }
        return result;
    }
}

