import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] bus = new String[n];
        boolean changed = false;

        for(int i=0;i<n;i++){
            sc.reset();
            bus[i] = sc.next();
        }


        for (int i=0;i<bus.length;i++){
            String[] splitted = bus[i].split("\\|");
            if(splitted[0].equals("OO")){
                bus[i] = "++|"+splitted[1];
                System.out.println("YES");
                changed = true;
                break;
            }else if(splitted[1].equals("OO")){
                bus[i]=splitted[0]+"|++";
                System.out.println("YES");
                changed = true;
                break;
            }
        }

        if(changed){
            for(int i=0;i<bus.length;i++){
                System.out.println(bus[i]);
            }
        }else{
            System.out.println("NO");
        }






//        String test = "OO|XX";
//        String[] temp  = test.split("\\|");
//
//        System.out.println(temp[0]);
//        System.out.println(temp[1]);
    }
}
