import java.util.Scanner;

public class PGM_Experiment_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = {0,1,2,3,4};
        double[] probabilities = {0.1, 0.3, 0.2, 0.3, 0.1};

        double expectedValue = 0;
        for (int i = 0; i < 5; i++) {
            expectedValue += values[i] * probabilities[i];
        }

        double expectedValueSquare = 0;
        for (int i = 0; i < 5; i++) {
            expectedValueSquare += values[i] * values[i] * probabilities[i];
        }

        double variance = expectedValueSquare - (expectedValue * expectedValue);

        System.out.println("Expected Value (E(X)): " + expectedValue + "\nVariance (Var(X)): " + variance);
        scanner.close();
    }
}