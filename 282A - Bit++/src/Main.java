import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        String command;
        int x = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.reset();
            command = sc.next();

            if(command.charAt(0) == '+'){
                ++x;
            }else if(command.charAt(command.length()-1) == '+'){
                x++;
            }else if((command.charAt(command.length()-1) == '-')){
                x--;
            }else if((command.charAt(0) == '-')){
                --x;
            }

        }
        System.out.println(x);
    }
}
