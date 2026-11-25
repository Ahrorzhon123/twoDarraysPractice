public class practice2darrays7 {
    public static void main(String[] args){
        int [] [] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum1 = 0;

        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                sum1+=matrix[i][j];
            }
            System.out.println("Sum is : "+sum1);
        }
    }
}
