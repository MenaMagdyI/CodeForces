import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
	    String holder = "";
	    boolean flag = false;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();


        while(n>0)
        {
            if(n%1000==144)
            {
                n/=1000;
            }
            else if(n%100==14)
            {
                n/=100;
            }

            else if(n%10==1)
            {
                n/=10;
            }
            else
            {
                System.out.println("NO");
                return ;
            }
        }
        System.out.println("YES");



    }
}
