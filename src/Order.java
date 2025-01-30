public class Order extends Pizza {
  
    /* 
     * Constructor to initialize the pizza type
     * Replaces the regular calories and price with the new variables given when case matches the user input
     * It does it by passing pizza, calories, and price to the superclass
     */
    public Order(String pizza) {
        super(pizza, getCaloriesByCase(pizza), getPriceByCase(pizza));
    }
  
    /*
     * Method to get the calories based on pizza name
     * When case (user input) matches, it "switches" values
     * Default is returned when no other cases match
     */
    private static int getCaloriesByCase(String pizza) { 
        switch (pizza) {
            case "Veggie":
                return 2540; // Calories for Veggie
            case "Meatlover":
                return 3090; // Calories for Meatlover
            case "Cheese":
                return 2340; // Calories for Cheese
            case "Pepperoni":
                return 2870; // Calories for Pepperoni
            default:
                return 0; // If pizza inputted is not known, calories = 0
        }
    }

    /*
     * Method to get the price based on pizza name
     */
    private static double getPriceByCase(String pizza) { 
        switch (pizza) {
            case "Veggie":
                return 10.50; // Price for Veggie
            case "Meatlover":
                return 17.00; // Price for Meatlover
            case "Cheese":
                return 9.50; // Price for Cheese
            case "Pepperoni":
                return 13.00; // Price for Pepperoni
            default:
                return 0.0; // If pizza inputted is not known, price = 0.0
        }
    }
}
