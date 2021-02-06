import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sum;
        int operatorCount = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> sortedSum = new ArrayList<>();

        sum = sc.next();
        for (int i = 0; i < sum.length(); i++) {
            if (sum.charAt(i) == '+') {
                operatorCount++;
            } else {
                sortedSum.add(sum.charAt(i));
            }
        }
        Collections.sort(sortedSum);

        for (int i = 0; i < sortedSum.size(); i++) {
            System.out.print(sortedSum.get(i));
            if(operatorCount>0){
                operatorCount--;
                System.out.print("+");
            }
        }
    }
}
