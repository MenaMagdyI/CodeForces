import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        String cells;
        Scanner sc = new Scanner(System.in);
        int affectedCells = 0;

        n = sc.nextInt();
        cells = sc.next();

        for(int i=0;i<n;i++){
            if(cells.charAt(i)=='1'){
                affectedCells++;
            }
            else{
                affectedCells++;
                break;
            }

        }

        System.out.println(affectedCells);

    }
}
