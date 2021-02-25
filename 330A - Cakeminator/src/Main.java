import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String arr[][] = new String[n+1][m+1];
        for(int i=0;i<n;i++){

                String input = sc.next();
                arr[i] = input.split("(?!^)");


        }

        int rowCakeCounter = 0;
        int rows = 0;
        int column = 0;
        int columnCakeCounter = 0;

        for(int i=0;i<n;i++){
            int localCounter =0;
            for(int j=0;j<m;j++){
                if (arr[i][j].equals(".") ){
                    localCounter++;
                }
                else {
                    break;
                }
            }
            if(localCounter == m){
                rowCakeCounter +=localCounter;
                rows++;
            }
        }

        for(int i=0;i<m;i++){
            int localCounter =0;
            for(int j=0;j<n;j++){
                if (arr[j][i].equals(".") ){
                    localCounter++;
                }
                else{
                    break;
                }
            }
            if(localCounter == n){
                rowCakeCounter +=localCounter;
                column++;
            }
        }
        int result = rowCakeCounter+ (columnCakeCounter - (column * rows));
        System.out.println(result);


    }
}
