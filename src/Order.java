import java.util.Scanner; // Import the Scanner class

 class Order extends Pizza {
  public static void main(String[] args) {
    int calories, price, sum;
    String name, pizza, crust;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    System.out.println("Type your Name: ");
    name = myObj.nextLine();

    System.out.println("Type your Pizza: ");
    pizza = myObj.nextLine(); // Read user input

    System.out.println("Type your crust: ");
    crust = myObj.nextLine(); // Read user input

   // System.out.println("Type your diameter (Inches): ");
   // diameter = myObj.nextInt(); // Read user input

    sum = 0;
    calories = 0;
    price = 0;

   if (pizza=="Veggie") {
    System.out.println(sum = calories + 1); //add cals for each item next time
   }

   if (pizza=="Meatlover") {
    System.out.println(sum = calories + 2);
   } 

   if (pizza=="Cheese") {
    System.out.println(sum = calories + 3);
   }

   if (pizza=="Pepporonni") {
    
    System.out.println(sum = calories + 4);
   }

   if (crust=="Plain") {
    System.out.println(sum = calories + 1);
   }

   if (crust=="Garlic") {
    System.out.println(sum = calories + 2);
   }

   if (crust=="Cheesy") {
    System.out.println(sum = calories + 3);
   }


   
   System.out.println("Order for " + name + ", one " + pizza + " pizza (calories: " + calories + ")" );


  // public String toString() {
  //  return "Pizza: " + pizza + "\n" + "Price: " + price + "\n";
  // }

















    myObj.close();
  }
} 