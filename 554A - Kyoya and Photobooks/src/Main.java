import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        int size = input.length()+1;

        System.out.println((26 * size)-input.length());

    }
}
