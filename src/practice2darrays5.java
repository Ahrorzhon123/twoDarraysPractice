public class practice2darrays5 {
    public static void main(String[] args){
        int [] [] minimumMax = {
                {12,35,64,45},
                {65,76,12,34},
                {45,67,25,44}
        };
        int max = minimumMax[0][0];
        int small = minimumMax[0][0];
        System.out.println("The matrix: ");
        for (int i = 0; i < minimumMax.length; i++){
            for (int j = 0; j < minimumMax[i].length; j++){
                System.out.print(minimumMax[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < minimumMax.length; i++){
            for (int j = 0; j < minimumMax[i].length; j++){
                if (minimumMax[i][j] > max){
                    max = minimumMax[i][j];
                }
            }
        }
        for (int i = 0; i < minimumMax.length; i++){
            for (int j = 0; j < minimumMax[i].length; j++){
                if (minimumMax[i][j] < small){
                    small = minimumMax[i][j];
                }
            }
        }
        System.out.println("The largest value: " + max);
        System.out.println("The smallest value: " + small);
    }
}
