import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s,t;
        Scanner sc = new Scanner(System.in);

        int currentPosition = 0;

        s = sc.next();
        t = sc.next();

        for(int i=0 ;i<t.length();i++){
            if(t.charAt(i) == s.charAt(currentPosition)){
                currentPosition++;
            }
        }
        System.out.println(currentPosition+1);

    }
}
