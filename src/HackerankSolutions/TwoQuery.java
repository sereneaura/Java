package HackerankSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the number of queries");
        int q = scanner.nextInt();
        int a, b , c = 0;
        for (int i = 0; i < q; i++) {
            System.out.println("input a");
            a = scanner.nextInt();
            System.out.println("input b");
            b = scanner.nextInt();
            System.out.println("input c");
            c = scanner.nextInt();
            int series = 0;

            for (int j = 0; j < c; j++) {
                if (j == 0){
                    series = a + ((int)Math.pow(2, 0) * b);
                }
                else{
                    series = series + ((int)Math.pow(2, j) * b);
                }
                System.out.print(series + " ");
            }
            System.out.println();

        }
    }

}
