import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int d[] = new int[n+1];
        for(int i = 1; i <= n; ++i)
            d[i] = sc.nextInt();
        int s, t;
        s = sc.nextInt();
        t = sc.nextInt();
        if(s == t)
        {
            System.out.println(0);
            return;
        }
        if(s > t){
            int temp = s;
            s = t;
            t = temp;
        }
        int sum1 = 0, sum2 = 0;
        for(int i = s; i < t; ++i)
            sum1 += d[i];
        for(int i = t; i <= n; ++i)
            sum2 += d[i];
        for(int i = 1; i < s; ++i)
            sum2 += d[i];
        sum1 = Math.min(sum1, sum2);
        System.out.println(sum1);
    }
}
