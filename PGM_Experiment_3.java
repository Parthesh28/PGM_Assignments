import java.util.Scanner;

public class PGM_Experiment_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values of the Random Variable: ");
        int n = scanner.nextInt();

        double[] values = new double[n];
        double[] probabilities = new double[n];

        System.out.println("Enter the values and their corresponding probabilities:");
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();

            System.out.print("Probability at Random Variable at value: " + (i + 1) + ": ");
            probabilities[i] = scanner.nextDouble();
        }

        double expectedValue = 0;
        for (int i = 0; i < n; i++) {
            expectedValue += values[i] * probabilities[i];
        }

        double expectedValueSquare = 0;
        for (int i = 0; i < n; i++) {
            expectedValueSquare += values[i] * values[i] * probabilities[i];
        }

        double variance = expectedValueSquare - (expectedValue * expectedValue);

        System.out.println("Expected Value (E(X)): " + expectedValue);
        System.out.println("Variance (Var(X)): " + variance);

        scanner.close();
    }
}