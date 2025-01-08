public class App {
    public static void main(String[] args) {
  
        System.out.println("1V = Broccolli, 2V = Mushroom");
        System.out.println("1M = Meatballs, 2M = Pepperonni");
        System.out.println("1S = Marinara Sauce, 2S = BBQ Sauce");
        System.out.println("1C = Mozzerella, 2C = Parmesean");

        Pizza Monkey = new Pizza(1000, 29029, 0.5);

        System.out.println();
        System.out.println("Stats of Monkey");
        Monkey.printPizzaInfo();
          
        Pizza Gorilla = new Pizza(5000, 293, 0.6);

        System.out.println();
        System.out.println("Stats of Gorilla");
        Gorilla.printPizzaInfo();
    
    }
}
