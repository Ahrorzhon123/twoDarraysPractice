public class practice2darrays3 {
    public static void main(String[] args) {
        int[][] sumall = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };
        int sum = 0;

        System.out.println("The matrix: ");
        for (int i = 0; i < sumall.length; i++) {
            for (int j = 0; j < sumall[i].length; j++) {
                System.out.print(sumall[i][j] + " ");
            }
            System.out.println();
        }


                for (int i = 0; i < sumall.length; i++) {
                    for (int j = 0; j < sumall[i].length; j++) {
                        sum += sumall[i][j];
                    }
                    System.out.println();
                }

                System.out.println("Sum of all element is: " + sum);
            }
        }

