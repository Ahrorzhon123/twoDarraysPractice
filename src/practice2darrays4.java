public class practice2darrays4 {
    public static void main(String[] args){
        int [] [] evenOdd = {
                {23, 45, 67},
                {23,56,12},
                {14,15,19}
        };
        int even = 0;
        int odd = 0;

        System.out.println("The matrix: ");
        for (int i = 0; i < evenOdd.length; i++) {
            for (int j = 0; j < evenOdd[i].length; j++) {
                System.out.print(evenOdd[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < evenOdd.length; i++){
            for (int j = 0; j < evenOdd[i].length; j++){
                if (evenOdd[i][j] % 2 == 0){
                    even += 1;
                } else if (evenOdd[i][j] % 2 != 0)  {
                    odd+=1;
                }
            }
            System.out.println();
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
