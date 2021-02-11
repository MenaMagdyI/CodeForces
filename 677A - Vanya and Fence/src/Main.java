import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,h;
        int f;
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        n = sc.nextInt();
        h = sc.nextInt();

        for(int i=0;i<n;i++){
            sc.reset();
            f = sc.nextInt();
            if(f>h){
                counter +=2;
            }else {
                counter +=1;
            }
        }
        System.out.println(counter);
    }
}
