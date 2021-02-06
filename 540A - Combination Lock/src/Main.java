import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        String a,b;
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.next();
        b = sc.next();


        for(int i=0;i<n;i++){
            int dif = Math.abs(a.charAt(i) - b.charAt(i));
            ans+= Math.min((10-dif),dif);
        }

        System.out.println(ans);
    }
}
