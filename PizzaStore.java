 

import java.util.List;
import java.util.ArrayList;

public class PizzaStore {
    
    private int storeId;
    private String storeName;
    private String storeLocation;
    private List<Pizza> pizzas = new ArrayList<>();
    
    public PizzaStore() { }
    
    public PizzaStore(int storeId, String storeName, String storeLocation) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }
    
    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
    
    public void deletePizza(Pizza pizza) {
        this.pizzas.remove(pizza);
    }
    
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getStoreLocation() {
        return storeLocation;
    }
    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
    public List<Pizza> getPizzas() {
        return pizzas;
    }
    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }


    @Override
    public String toString() {
        
        return "\nPizzaStore Details => ID : " + storeId + ", Store Name : " + storeName + ", Location : " 
                + storeLocation    + "\n\nAvailable Pizzas : \n" + pizzas + "\n\nAvailable Orders : \n";
    }
}
