public class Pizza {
  
    private String pizza; // The pizza name
    private int calories; // The amount of calories
    private double price; // The price of the pizza
  
    // Default constructor
    public Pizza() {
        this("Nothing", 0, 0.0); // Default price is set to 0.0
    }
  
    /*
     * Sets the pizza to the specified pizza 
     * Sets the calories to the specified calories 
     * Sets the price to the specified price
     */
    public Pizza(String pizza, int calories, double price) {
        this.pizza = pizza;
        this.calories = calories;
        this.price = price;
    }

    // Returns the pizza name
    public String getPizza() {
        return pizza;
    }

    // Returns the calories
    public int getCalories() {
        return calories;
    }

    // Returns the price
    public double getPrice() {
        return price;
    }

    // Sets pizza to newPizza
    public void setPizza(String newPizza) {
        pizza = newPizza;
    }

    // Sets calories to newCalories
    public void setCalories(int newCalories) {
        calories = newCalories;
    }

    // Sets price to newPrice
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    // Overrides the pizza, calories, and price variables, and prints them into string
    @Override 
    public String toString() {
        return "Pizza: " + pizza + "\nCalories: " + calories + "\nPrice: $" + price + "\n";
    }
}
