import java.util.Scanner;
public class practice2darrays6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] [] matrix = new int[2][3];
        System.out.println("Fill the 2x3 matrix: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println("Enter "+ (i + 1)+ "x"+(j+1) + " matrix: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your matrix is: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
