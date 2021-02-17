import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int manPower =0;
        int untreated = 0;
        int input;


        for (int i=0;i<n;i++){
            input = sc.nextInt();
            if(input>0){
                manPower +=input;
            }

            else if(input<0){
                if(manPower > 0)
                    manPower -= 1;
                else
                    untreated++;

            }

        }
        System.out.println(untreated);

    }
}
