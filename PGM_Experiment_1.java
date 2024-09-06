import java.util.* ;

public class PGM_Experiment_1 {
    public static void main(String[] args) {
        int trial = 100000;
        int[] outputs = new int[6];

        Random random = new Random();

        for (int i = 1; i <= trial; i++) {
            int outcome = random.nextInt(6) + 1;
            outputs[outcome - 1] = outputs[outcome - 1] + 1;
        }

        System.out.println("Total number of trials: " + trial);
        for (int face = 1; face <= 6; face++) {
           double probabilityOfFace = (double) outputs[face - 1] / trial;
            System.out.println("Face " + face + ": Count = " + outputs[face - 1] + ", Expected Probability = " + probabilityOfFace);
        }
    }
}