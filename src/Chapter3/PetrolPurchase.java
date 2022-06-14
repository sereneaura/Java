package Chapter3;

import java.util.PrimitiveIterator;

public class PetrolPurchase {
    private String location;
    private String petrol;
    private  int litresQuantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String location, String petrol, int litresQuantity,
                          double pricePerLitre, double percentageDiscount){
        this.location = location;
        this.petrol = petrol;
        this.litresQuantity = litresQuantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;

    }
    public void setLocation(String newLocation){
          this.location =newLocation;
    }
    public String getLocation(){
        return location;
    }
    public void setPetrol(String newPetrol){
        this.petrol = newPetrol;
    }
    public String getPetrol(){
        return petrol;
    }
    public void setLitresQuantity(int newLitresQuantity){
        this.litresQuantity = newLitresQuantity;
    }
    public int getLitresQuantity(){
        return litresQuantity;
    }
    public void setPricePerLitres(double newPricePerLitres){
        this.pricePerLitre = newPricePerLitres;
    }
    public double getPricePerLitre(){
        return pricePerLitre;
    }
    public void setPercentageDiscount(double newPercentageDiscount){
        this.percentageDiscount = newPercentageDiscount;
    }
    public double getPercentageDiscount(){
        return  percentageDiscount;
    }
    public int getPurchaseAmount(){
        double total = litresQuantity * pricePerLitre;
        double discount = total * percentageDiscount / 100;
        return (int) (total - discount);
    }
}
