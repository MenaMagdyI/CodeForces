import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Long t,i,n,k;
        Scanner sc = new Scanner(System.in);
        t = sc.nextLong();
        while(t>0)
        {
            n = sc.nextLong();
            k = sc.nextLong();
            if(k>=n)
            {
                if(k%n==0)
                    System.out.println(k/n);
                else
                    System.out.println(k/n+1);
            }
            else
            {
                if(n%k==0)
                    System.out.println(1);
                else
                {
                    System.out.println(2);
                }
            }
            t--;
        }

    }
}
