package HackerankSolutions;

import java.util.Scanner;

public class _10Multiples {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//        int integer = scanner.nextInt();

        for (int i = 2; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
//            int multiples = integer * i;
                System.out.printf("%3d X %3d = %3d%n", i,j,i*j);

            }
            System.out.println();
        }
    }
}