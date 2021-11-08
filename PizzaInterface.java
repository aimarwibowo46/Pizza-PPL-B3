 

import java.util.List;

public interface PizzaInterface {
    
    public Pizza addNewPizza(Pizza pizza);
    
    public void deletePizza(Pizza pizza);
    
    public Pizza updatePrice(Pizza pizza, double newPrice);
    
}