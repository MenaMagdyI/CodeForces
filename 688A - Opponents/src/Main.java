import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, d;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();

        String input;
        int maxWin = 0;
        int counter = 0;
        boolean allOpponents;
        boolean prevWin = true;

        for (int i = 0; i < d; i++) {
            sc.reset();
            input = sc.next();
            allOpponents = true;

            for (int j = 0; j < n; j++) {
                if (input.charAt(j) == '0') {
                    allOpponents = false;
                    counter++;
                    break;
                }
            }


            if (counter > maxWin) {
                maxWin = counter;
            }
            if (allOpponents) {
                counter = 0;
            }

        }

        System.out.println(maxWin);
    }
}
