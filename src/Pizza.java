/*
 * Represents a dessert that can be sold at a food truck
 */
public class Pizza {

    private String pizza;    // The pizza of a dessert
    private double price;     // The price of a dessert
    private int calories;
  
    /*
     * Sets pizza to "cheese" and price to 12.50
     */
    public Pizza() {
      this("cheese", 12.50, 1740);
    }
  
    /*
     * Sets pizza to the specified pizza and
     * price to the specified price
     */
    public Pizza(String pizza, double price, int calories) {
      this.pizza = pizza;
      this.price = price;
      this.calories = calories;
    }
  
    public String getPizza() {
      return pizza;
    }
  
    public double getPrice() {
      return price;
    }

    public int getCalories() {
      return calories;
    }

    public void setPrice(double newPrice) {
      price = newPrice;
    }
  
    public void setPizza(String newPizza) {
      pizza = newPizza;
    }

    public void setCalories(int newCalories) {
      calories = newCalories;
    }

    public String toString() {
        return "pizza: " + pizza + "\n" + "Price: " + price + "\n" + "calories: " + calories + "\n";
    }
    

  }