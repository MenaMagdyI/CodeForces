import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int sum = 0;

        for (int i=0;i<n;i++){
            sum+= sc.nextInt();
        }

        sum = Math.abs(sum);

        int cards = 0;

        while(sum > 0){
            cards++;
            sum -= x;
        }

        System.out.println(cards);
    }
}
