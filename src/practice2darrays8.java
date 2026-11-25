import java.util.Scanner;
public class practice2darrays8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] [] matrix = {
                {23,67,12},
                {76,25,18},
                {11,34,74}
        };
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        int greatNum = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > userInput){
                    greatNum+=1;
                }
            }
        }
        System.out.println("Values grater than "+userInput+ ": " + greatNum);
    }
}
