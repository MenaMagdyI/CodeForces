import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int localCounter = 1;

        int chestCounter = 0, biCounter = 0,bkCounter=0;

        for(int i=0;i<n;i++){
            int temp = sc.nextInt();

            if(localCounter==1){
                chestCounter+=temp;
            }else if(localCounter == 2){
                biCounter+=temp;
            }else if(localCounter == 3){
                bkCounter+=temp;
            }


            if(localCounter == 3){
                localCounter = 0;
            }

            localCounter++;
        }

        if(chestCounter>biCounter && chestCounter > bkCounter)
            System.out.println("chest");
        else if(biCounter>chestCounter && biCounter>bkCounter)
            System.out.println("biceps");
        else if(bkCounter>chestCounter && bkCounter>biCounter)
            System.out.println("back");
    }
}
