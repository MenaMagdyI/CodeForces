import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        String input="";
        String home;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        home = sc.next();
        for(int i=0;i<n;i++){
            sc.reset();
            input = sc.next();
        }

        //heheheheheheheeee
        //i didnt notice arbitarry order thing mmmm let see

        if(n%2 == 0){
            System.out.println("home");
        }else{
            System.out.println("contest");
        }
    }
}
