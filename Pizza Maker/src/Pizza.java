public class Pizza {

    private int Calories;    
    private int Deliciousness;
    private double Price;     
  
    public Pizza(int vCalories, int vDeliciousness, double vPrice) {
        Calories = vCalories;
        Deliciousness = vDeliciousness;
        Price = vPrice;
    }

    public void printPizzaInfo() {
        System.out.println("Calories: " + Calories);
        System.out.println("Deliciousness:" + Deliciousness + "/300");
        System.out.println("Price: " + Price);
    }


}
  