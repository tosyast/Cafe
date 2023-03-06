import java.util.ArrayList;
import java.util.List;
//Класс Заказ
public class Order {
    private List<Coffee> coffees;
    private double totalPrice;

    public Order() {
        coffees = new ArrayList<>();
        totalPrice = 0;
    }

    public void addCoffee(Coffee coffee) {
        coffees.add(coffee);
        totalPrice += coffee.getPrice();
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
