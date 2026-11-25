public class optionalA {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {2, 2, 2, 2}
        };

        int maxSum = 0;
        int maxRow = 0;

        for (int j = 0; j < arr[0].length; j++) {
            maxSum += arr[0][j];
        }

        for (int i = 1; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i;
            }
        }

        System.out.println("Row with largest sum: " + maxRow);
        System.out.println("Sum: " + maxSum);
    }
}
