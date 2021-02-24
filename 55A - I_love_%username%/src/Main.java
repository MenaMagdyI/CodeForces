import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int max,min;
        int score;
        int amazing=0;

        score = sc.nextInt();
        max = score;
        min = score;

        for(int i=1;i<n;i++){
            score = sc.nextInt();
            if(score>max){
                amazing++;
                max = score;
            }
            if(score<min){
                amazing++;
                min = score;
            }
        }

        System.out.println(amazing);
    }
}
