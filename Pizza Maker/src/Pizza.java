public class Pizza {

    private String name;
    private int calories;
    private double price;

        public Pizza(String name, int calories, double price) {
            super();
            this.name = name;
            this.calories = calories;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setString(String name) {
            this.name = name;        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }