import java.util.Scanner; // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    int V, M, S, C, sum;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type your Vegetable:");
    V = myObj.nextInt(); // Read user input

    System.out.println("Type you Meat:");
    M = myObj.nextInt(); // Read user input

    System.out.println("Type your Dressing:");
    S = myObj.nextInt(); // Read user input

    System.out.println("Type your Cheese:");
    C = myObj.nextInt(); // Read user input

    sum = V + M + S + C;  // Calculate the Calories of Vegetables, Meat, Sauce, and Cheese
    System.out.println("Sum is: " + sum); // Print the sum
  }
} 