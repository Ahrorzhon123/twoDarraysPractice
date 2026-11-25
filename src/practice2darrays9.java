import java.util.Scanner;
public class practice2darrays9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
                {1, 5, 8},
                {4, 7, 9},
                {8, 4, 5}
        };
        System.out.println("Enter the search number: ");
        int userInput = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == userInput) {
                    System.out.print("Number is found on " + (i + 1) + " row and " + (j + 1) + " column\n");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}