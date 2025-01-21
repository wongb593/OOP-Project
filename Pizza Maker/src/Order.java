import java.util.Scanner; // Import the Scanner class

 class Order {
  public static void main(String[] args) {
    String V, M, S, C, sum;
    String name;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    System.out.println("Type your Name:");
    name = myObj.nextLine();

    System.out.println("Type your Vegetable:");
    V = myObj.nextLine(); // Read user input

    System.out.println("Type you Meat:");
    M = myObj.nextLine(); // Read user input

    System.out.println("Type your Dressing:");
    S = myObj.nextLine(); // Read user input

    System.out.println("Type your Cheese:");
    C = myObj.nextLine(); // Read user input

   // sum = V + M + S + C;  // Calculate the Calories of Vegetables, Meat, Sauce, and Cheese
   // System.out.println("Sum is: " + sum); // Print the sum

    System.out.println("Vegetable:" + V);


    myObj.close();
  }
} 