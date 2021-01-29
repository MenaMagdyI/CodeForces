import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int usedCups = 0;
        int pyramidLevel = 0;
        int cupsRequired = 0;
        n = sc.nextInt();


        int i =1;
        cupsRequired = i;
        while(true){

            if((n - usedCups) >= cupsRequired){
                usedCups += cupsRequired;
                pyramidLevel++;
                i++;
                cupsRequired +=i;
            }
            else{
                break;
            }


        }

        System.out.println(pyramidLevel);


    }
}
