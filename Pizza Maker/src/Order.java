import java.util.Scanner; // Import the Scanner class

 class Order {
  public static void main(String[] args) {
    int C, calories, price, sum;
    String name, pizza;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    System.out.println("Type your Name:");
    name = myObj.nextLine();

    System.out.println("Type your Pizza:");
    pizza = myObj.nextLine(); // Read user input

    System.out.println("Type your crust #:");
    C = myObj.nextInt(); // Read user input

   // sum = V + M + S + C;  // Calculate the Calories of Vegetables, Meat, Sauce, and Cheese
   // System.out.println("Sum is: " + sum); // Print the sum

    sum = 0;
    calories = 0;
    price = 0;

   if (pizza=="Veggie") {
    System.out.println(sum = calories + 1);
   }

   if (pizza=="Meat lover") {
    System.out.println(sum = calories + 2);
   } 

   if (pizza=="Cheese") {
    System.out.println(sum = calories + 3);
   }

   if (pizza=="Pepporonni") {
    
    System.out.println(sum = calories + 4);
   }

   if (C==1) {
    System.out.println(sum = calories + 1);
   }

   if (C==2) {
    System.out.println(sum = calories + 2);
   }

   if (C==3) {
    System.out.println(sum = calories + 3);
   }

   System.out.println("Order for " + name + ", one " + pizza + " pizza (calories: " + calories + ")" );



















    myObj.close();
  }
} 