import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();

        int arr[] = new int [n+1];
        int stopIndex = n;

        for(int i =1;i<=m;i++){
            int temp = sc.nextInt();
            for(int j=stopIndex;j>=temp;j--){
                arr[j] = temp;
                stopIndex = j-1;
            }


        }

        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
