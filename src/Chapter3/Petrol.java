package Chapter3;

public class Petrol {
    public static void main(String[] args) {
       PetrolPurchase  myPetrolPurchase = new PetrolPurchase("yaba",
               "gasoline", 45, 34, 89);

       String petrolName =myPetrolPurchase.getPetrol();
       String locationName = myPetrolPurchase.getLocation();
       int litresQuantity = myPetrolPurchase.getLitresQuantity();
       double pricePerLitre = myPetrolPurchase.getPricePerLitre();
       double percentageDiscount = myPetrolPurchase.getPercentageDiscount();
       int purchaseAmount = myPetrolPurchase.getPurchaseAmount();

       String output = String.format("""
                petrolName: %s
                locationName: %s
                litresQuantity: %d
                pricePerLitre: %.2f
                percentageDiscount: %.2f
                purchaseAmount: %d
                
                """,petrolName,locationName,litresQuantity,pricePerLitre,percentageDiscount
       ,purchaseAmount);


        System.out.println(output);



    }
}
