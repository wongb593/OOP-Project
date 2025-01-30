import java.util.ArrayList; // Imports Array
import java.util.Scanner; // Imports Scanner

public class App {
    
    public static void main(String[] args) {

        // Name variable and pizza variable
        String name, pizza; 

        // Create a Scanner object
        Scanner myObj = new Scanner(System.in); 

        System.out.println("Type your Name: "); // Reads user input in format of string
        name = myObj.nextLine(); 
      
        // Display the list of pizza using ARRAY, not system print
        ArrayList<String> Ingredients = new ArrayList<String>(); 
        Ingredients.add(" ");
        Ingredients.add("Types of Pizza:");
        Ingredients.add("Veggie");
        Ingredients.add("Meatlover");
        Ingredients.add("Cheese");
        Ingredients.add("Pepperoni");
        Ingredients.add(" ");
        for (String i : Ingredients) {
            System.out.println(i);
        }

        System.out.println("Type your Pizza (Type with proper caps): ");
        pizza = myObj.nextLine(); // Reads user input in format of string

        // Closes Obj so it doesn't read anymore
        myObj.close(); 

        // Create an Order object with the pizza type
        Order pizzaben = new Order(pizza);

        // Prints the name, then the attributes for pizzaben based on user input
        System.out.println("\nOrder for " + name + "\n" + pizzaben); 
    }
}
