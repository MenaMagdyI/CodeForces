import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        String row;
        Scanner sc = new Scanner(System.in);
        int currentIndex = 0;
        int stoneCounter =0;

        n = sc.nextInt();
        row = sc.next();

        for (int i=1;i<n;i++){
            if(row.charAt(currentIndex) == row.charAt(i)){
                stoneCounter++;
            }else if(row.charAt(currentIndex) != row.charAt(i)){
                currentIndex = i;
            }
        }

        System.out.println(stoneCounter);
    }
}
