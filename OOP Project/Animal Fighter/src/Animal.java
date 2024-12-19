public class Animal {

    private int Health;    
    private int Damage;
    private double Luck;     
  
    public Animal(int aHealth, int aDamage, double aLuck) {
        Health = aHealth;
        Damage = aDamage;
        Luck = aLuck;
    }

    public void printAnimalInfo() {
        System.out.println("Damage: " + Damage);
        System.out.println("Health: " + Health);
        System.out.println("Luck: " + Luck);
    }


}
  