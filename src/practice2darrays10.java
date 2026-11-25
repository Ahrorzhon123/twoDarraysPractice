public class practice2darrays10 {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i][i]+ " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++){
            sum += arr[i][i];

        }
        System.out.println("Sum for diogonal matrix is: " + sum);
    }
}
