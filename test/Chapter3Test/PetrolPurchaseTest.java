package Chapter3Test;

import Chapter3.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    PetrolPurchase myPetrolPurchase;
    @BeforeEach
    void createObject(){

        myPetrolPurchase = new PetrolPurchase("yaba",
                "gasoline", 45, 34.5, 87.98 );
    }
    @Test
    void petrolPurchaseObject(){
        assertNotNull(myPetrolPurchase);
        myPetrolPurchase.setLocation("ikeja");
        assertEquals("ikeja", myPetrolPurchase.getLocation());
    }
    @Test
    void TestThatWeCanGetPetrol(){

        assertEquals("gasoline", myPetrolPurchase.getPetrol());


    }
    @Test
    void TestThatWeCanGetLitresQuantity(){

        assertEquals(45, myPetrolPurchase.getLitresQuantity());

    }
    @Test
        void TestThatWeCanGetPricePerLitre(){

        assertEquals(34.5, myPetrolPurchase.getPricePerLitre());
    }

    @Test
    void TestThatWeCanGetPercentageDiscount(){


        assertEquals(87.98, myPetrolPurchase.getPercentageDiscount());
    }
    @Test
    void  TestThatWeCanGetPurchaseAmount(){

        assertEquals(186, myPetrolPurchase.getPurchaseAmount());
    }

}
