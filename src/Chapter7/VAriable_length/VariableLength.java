package Chapter7.VAriable_length;

public class VariableLength {
    public static double average(int... seriesOfNumbers){
        double total = 0;
        for (int i = 0; i < seriesOfNumbers.length; i++) {
            total += seriesOfNumbers[i];
        }
        return total / seriesOfNumbers.length;

    }
}
