public class Veggie extends Pizza {
    
    private int calories;   // Whether or not a cookie is chewy

    /*
     * Sets isChewy to true
     */
    public Veggie() {
      calories = 1740;
    }
  
    /*
     * Sets the flavor to the specified flavor, the price to the
     * specified price, and isChewy to the specified status
     */
    public Veggie(String pizza, double price, int calories) {
      super(pizza, price);
      this.calories = calories;
    }
    
  
    public int getCalories() {
      return calories;
    }
      
    public void setCalories(int newCalories) {
      calories = newCalories;
    }
  
    public String toString() {
      return super.toString() + "Calories " + calories;
    }


}
