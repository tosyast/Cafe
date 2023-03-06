public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("Latte", "Coffee", 3.5);
        Coffee coffee2 = new Coffee("Cappuccino", "Coffee", 3.0);
        Coffee coffee3 = new Coffee("Mocha", "Coffee", 4.0);
        Coffee coffee4 = new Coffee("Сroissant" , "Dessert", 1.5);

        Cafe cafe = new Cafe();
        cafe.addToMenu(coffee1);
        cafe.addToMenu(coffee2);
        cafe.addToMenu(coffee3);
        cafe.addToMenu(coffee4);

        Order order1 = new Order();
        order1.addCoffee(coffee1);
        order1.addCoffee(coffee4);

        Order order2 = new Order();
        order2.addCoffee(coffee3);

        Order order3 = new Order();
        order3.addCoffee(coffee2);
        order3.addCoffee(coffee2);

        cafe.placeOrder(order1);
        cafe.placeOrder(order2);
        cafe.placeOrder(order3);


        System.out.println("Меню:");
        for (Coffee coffee : cafe.getMenu()) {
            System.out.println("- " + coffee.getName() + ", тип: " + coffee.getType()
                    + ", цена: $" + coffee.getPrice());
        }

        System.out.println("Список заказов:");
        for (Order order : cafe.getOrders()) {
            System.out.println("Заказ #" + (cafe.getOrders().indexOf(order) + 1)
                    + ", общая цена: $" + order.getTotalPrice());
            System.out.println("Состав заказа:");
            for (Coffee coffee : order.getCoffees()) {
                System.out.println("- " + coffee.getName() + ", тип: " + coffee.getType()
                        + ", цена: $" + coffee.getPrice());
            }
            System.out.println();
        }

        System.out.println("Список кофе:");
        for (Coffee coffee : cafe.getCoffeesByType("Coffee")) {
            System.out.println("- " + coffee.getName() + ", тип: " + coffee.getType()
                    + ", цена: $" + coffee.getPrice());
        }

        System.out.println("Общая выручка: $" + cafe.getTotalRevenue());
    }
}
