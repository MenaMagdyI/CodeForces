import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Character> charcters = new HashSet();

        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();

        for (int i=0;i<input.length();i++){


            if(input.charAt(i) != '{' && input.charAt(i) != '}' && input.charAt(i) != ',' && input.charAt(i) != ' '){
                    charcters.add(input.charAt(i));

            }
        }

        System.out.println(charcters.size());

    }
}
