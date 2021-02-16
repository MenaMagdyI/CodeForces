import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int teams[][] = new int[n][2];
        int gamesCounter = 0;

        for(int i=0;i<n;i++){
            sc.reset();
            teams[i][0] = sc.nextInt();
            teams[i][1] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i == j)
                    continue;

                if(teams[i][0] == teams[j][1])
                    gamesCounter++;

                if (teams[i][1] == teams[j][0])
                    gamesCounter++;

            }
        }

        System.out.println(gamesCounter/2);
    }
}
