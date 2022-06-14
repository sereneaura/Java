package Chapter3;

public class Car {

    private String model;
    private String year;
    double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public  void setModel(String newModel){
        this.model = newModel;
    }
    public String getModel(){
        return model;
    }
    public void setYear(String newYear){
        this.year = newYear;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(double newPrice){
        if(newPrice < 1){
            throw new IllegalArgumentException("Invalid input");
        }
        this.price = newPrice;
    }
    public double getPrice(){
        return price;
    }





}
