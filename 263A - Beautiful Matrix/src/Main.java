import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matrix[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int row=0,column=0;

        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                int temp = sc.nextInt();
                matrix[i][j] = temp;
                if(temp == 1){
                    row = i+1;
                    column = j+1;
                }
            }
        }
        int movies = Math.abs(row-3);
        movies+=Math.abs(column-3);

        System.out.println(movies);
    }
}
