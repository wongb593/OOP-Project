import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        int calories, price, sum;
        String name, pizza, crust;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Type your Name: ");
        name = myObj.nextLine();

        System.out.println("Type your Pizza: ");
        pizza = myObj.nextLine(); // Read user input

        close();

        ArrayList<String> Ingredients= new ArrayList<String>();
        Ingredients.add("Types of Pizza");
        Ingredients.add("Veggie: 1");
        Ingredients.add("Meat Lover: 2");
        Ingredients.add("Cheese: 3");
        Ingredients.add("Pepporonii: 4");
        Ingredients.add(" ");
        Ingredients.add("Types of Crust:");
        Ingredients.add("Basic: 1");
        Ingredients.add("Garlic: 2");
        Ingredients.add("Cheesy: 3");
        for (String i : Ingredients) {
          System.out.println(i);
        }

        Veggie ben = new Veggie();

        System.out.println("\n" + "order for " + name + "\n" + ben);





    }
}
