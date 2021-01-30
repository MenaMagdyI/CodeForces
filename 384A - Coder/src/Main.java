import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, ans;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        ans = (n*n) /2 ;
        if (n % 2 != 0) {
            ans++;
        }
        System.out.println(ans);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print('C');
                    } else {
                        System.out.print('.');
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print('C');
                    } else {
                        System.out.print('.');
                    }
                }
            }
            System.out.println();
        }
    }
}
