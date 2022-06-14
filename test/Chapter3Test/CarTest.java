package Chapter3Test;

import Chapter3.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    Car myCar;
    @BeforeEach
    void createObject(){
        myCar = new Car("Toyota", "TwentyTwenty", 130_000);
    }
    @Test
    void CarObject(){
        assertNotNull(myCar);
        assertEquals("Toyota", myCar.getModel());
    }
    @Test
    void TestThatWeCanGetYear(){

        assertEquals("TwentyTwenty", myCar.getYear());
    }
    @Test
    void TestThatWeCanGetPrice(){

        assertEquals(130_000, myCar.getPrice());
    }

}

