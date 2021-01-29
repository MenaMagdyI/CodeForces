import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();

        if(n % 2 == 0){
            System.out.println((n-4)+" "+ 4);
        }else{
            System.out.println((n-9)+" "+9);
        }
    }
}
