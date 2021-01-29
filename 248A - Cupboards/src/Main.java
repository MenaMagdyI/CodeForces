import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, l, r, left = 0, right = 0;

        n = sc.nextInt();

        for(int i =1 ;i<=n ; i++){
            sc.reset();
            l = sc.nextInt();
            r = sc.nextInt();

            left += l;
            right += r;
        }
        int min = Math.min(left, n-left) + Math.min(right, n-right);
        System.out.println(min);
    }
}
