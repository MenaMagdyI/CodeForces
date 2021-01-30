import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        String moves;
        Scanner sc = new Scanner(System.in);
        int dCounter = 0, aCounter =0;

        n = sc.nextInt();
        moves = sc.next();

        for(int i=0;i<n;i++){
            char ch = moves.charAt(i);
            if(ch == 'A'){
                aCounter++;
            }else if(ch == 'D'){
                dCounter++;
            }
        }

        if(aCounter > dCounter){
            System.out.println("Anton");
        }else if(dCounter > aCounter){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
