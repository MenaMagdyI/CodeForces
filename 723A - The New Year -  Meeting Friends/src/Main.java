import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[3];

        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();

        int min = Math.min(x[0],Math.min(x[1],x[2]));
        int max = Math.max(x[0],Math.max(x[1],x[2]));
        int mid =0;

        for(int i=0;i<3;i++){
            if(x[i] > min && x[i] <max){
                mid = x[i];
            }
        }


        int totalDistance=0;
        totalDistance += Math.abs(x[0]-mid) + Math.abs(x[1] -mid) + Math.abs(x[2]-mid);

        System.out.println(totalDistance);
    }
}
