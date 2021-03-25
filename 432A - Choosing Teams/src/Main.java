import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();

        int requiredPart = 5 - k;

        int stdCount = 0;
        for(int i=0 ;i<n;i++){
            int temp = sc.nextInt();
            if(temp <= requiredPart){
                stdCount++;
            }
        }

        System.out.println(stdCount/3);
    }
}
