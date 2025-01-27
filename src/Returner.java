import java.util.ArrayList;

public class Returner extends Order { 
  public static void main(String[] args) { 
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
  } 





}

