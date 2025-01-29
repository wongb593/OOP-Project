import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        String name, pizza;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Type your Name: ");
        name = myObj.nextLine();

        ArrayList<String> Ingredients= new ArrayList<String>();
        Ingredients.add(" ");
        Ingredients.add("Types of Pizza");
        Ingredients.add("Veggie");
        Ingredients.add("Meatlover");
        Ingredients.add("Cheese");
        Ingredients.add("Pepporonii");
        Ingredients.add(" ");
        for (String i : Ingredients) {
          System.out.println(i);
        }

        System.out.println("Type your Pizza: ");
        pizza = myObj.nextLine(); // Read user input

        myObj.close();

        Order ben = new Order();

        System.out.println("\n" + "order for " + name + "\n" + ben);





    }
}
