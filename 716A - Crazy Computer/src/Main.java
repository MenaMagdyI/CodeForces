import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Long c;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        c = sc.nextLong();
        int wordCounts = 0;
        Long prevSec = Long.valueOf(0);
        Long input;

        for(int i=0;i<n;i++){
            input = sc.nextLong();
            if(i == 0){
                wordCounts++;
                prevSec = input;
            }

            else {
                if((input-prevSec) <= c){
                    wordCounts++;
                    prevSec = input;
                }

                else if((input - prevSec) > c){
                    prevSec = input;
                    wordCounts = 1;
                }
            }
        }
        System.out.println(wordCounts);
    }
}
