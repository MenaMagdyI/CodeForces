import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int n;
        String pangram;
        Scanner sc = new Scanner(System.in);
        Set<Character> alphabet = new HashSet();

        n = sc.nextInt();
        if(n<26){
            System.out.println("NO");
        }else{
            pangram = sc.next();
            pangram = pangram.toLowerCase();
            for(int i=0;i<n;i++){
                alphabet.add(pangram.charAt(i));
            }

            if(alphabet.size() == 26){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
