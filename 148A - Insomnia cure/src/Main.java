import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k, l, m, n, d;
        int killedDragon=0;

        k = sc.nextInt();
        l = sc.nextInt();
        m = sc.nextInt();
        n = sc.nextInt();
        d = sc.nextInt();

        if(k==1){
            System.out.println(d);
        }else{
            for (int i=1;i<=d;i++){
                if(i%k==0 || i%l==0 || i%m==0 ||i%n==0 ){
                    killedDragon++;
                }
            }

            System.out.println(killedDragon);
        }

    }
}
