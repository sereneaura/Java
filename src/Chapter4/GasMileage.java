package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter miles driven");
//        int milesDriven = scanner.nextInt();
//
//        System.out.println("Enter miles driven");
//        int gallons = scanner.nextInt();

        int sentinelValue = 0;
        int trips = 0;
        int milesDriven;
        int gallons;
        double subTotal = 0;
        while (sentinelValue != -1) {
            System.out.println("Enter miles driven");
            milesDriven = scanner.nextInt();

            System.out.println("Enter gallons driven");
            gallons = scanner.nextInt();

            subTotal += (double) milesDriven / gallons;
            trips++;

            
            System.out.println("Enter -1 to end");
            sentinelValue = scanner.nextInt();
        }

        double average = subTotal/trips;
        System.out.println(average);


    }
}
