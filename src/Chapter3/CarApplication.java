package Chapter3;

public class CarApplication {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "TwentyTwenty", 13_000);
        Car abbyCar = new Car("Honda", "TwentyFour", 156000);

        String model = myCar.getModel();
        String year = myCar.getYear();
        double  price = myCar.getPrice();

        String output = String.format("""
                model: %s
                year: %s
                price: %f
                
                """,model, year, price);

        System.out.println(output);

         model = abbyCar.getModel();
         year = abbyCar.getYear();
          price = abbyCar.getPrice();

        output = String.format("""
                model: %s
                year: %s
                price: %f
                
                """,model, year, price);

        System.out.println(output);

    }
}
