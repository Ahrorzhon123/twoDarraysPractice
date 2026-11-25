public class practice2darrays12 {
    public static void main(String[] args) {
        int[][] scores = {
                {85, 90, 78, 92},
                {70, 65, 80, 75},
                {95, 88, 91, 99}
        };

        int max = scores[0][0];
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            int studentSum = 0;

            for (int j = 0; j < scores[i].length; j++) {
                studentSum += scores[i][j];

                if (scores[i][j] > max) {
                    max = scores[i][j];
                }
            }

            double studentAvg = (double) studentSum / scores[i].length;
            System.out.println("Student " + (i + 1) + " average: " + studentAvg);

            totalSum += studentSum;
        }

        double overallAvg = (double) totalSum / (scores.length * scores[0].length);

        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overallAvg);
    }
}