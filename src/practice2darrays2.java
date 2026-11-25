public class practice2darrays2 {
    public static void main(String[] args){
        int [][] acces = {
                {5,10,15},
                {20,25,30}
        };

        System.out.println(acces[1][2]);
        acces[0][1] = 99;
        for (int i = 0; i < acces.length; i++){
            for (int j = 0; j < acces[i].length; j++){
                System.out.print(acces[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
