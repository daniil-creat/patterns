package factory;

public class CoffeeShop {

    private final CoffeeFactory coffeeFactory;

    public CoffeeShop(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Кофе готов!");
        return coffee;
    }
}
