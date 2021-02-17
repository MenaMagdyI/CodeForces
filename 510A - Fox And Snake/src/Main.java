import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        boolean last = true;

        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                for (int j=1;j<=m;j++){
                    System.out.print("#");
                }
            }
            else if(i%2 == 0){
                if (last){
                    for (int j=1;j<=m;j++){
                        if(j==m)
                            System.out.print("#");
                        else
                            System.out.print(".");
                    }
                    last = false;
                }else{
                    for (int j=1;j<=m;j++){
                        if (j==1)
                            System.out.print("#");
                        else
                            System.out.print(".");

                    }
                    last = true;
                }
            }
            System.out.println();
        }

    }
}
