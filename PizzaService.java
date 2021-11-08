 

import java.util.List;

public class PizzaService implements PizzaInterface {

    private PizzaStore pizzaStore = new PizzaStore();
    private String pizzaNotFoundMessage = "Pizza with the given name is Not Available !!!";
    
    public PizzaService(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }
    
    @Override
    public Pizza addNewPizza(Pizza pizza) {    
        pizzaStore.addPizza(pizza);
        return null;
    }

    @Override
    public void deletePizza(Pizza pizza) {        
        pizzaStore.deletePizza(pizza);
    }

    @Override
    public Pizza updatePrice(Pizza pizza, double newPrice) {    
        pizza.setPrice(newPrice);
        return pizza;
    }
}