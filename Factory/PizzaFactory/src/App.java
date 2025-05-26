import PizzaFactory.Pizza;
import PizzaFactory.PizzaStore;
import PizzaFactory.SimplePizzaFactory;

public class App {
    public static void main(String[] args) throws Exception {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza1 = store.orderPizza("pepperoni");
        System.out.println("\n");
        Pizza pizza2 = store.orderPizza("cheese");
    }
}
