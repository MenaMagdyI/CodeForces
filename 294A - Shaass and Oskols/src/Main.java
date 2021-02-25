import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
	    int m;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int arr[] = new int[n+1];

	    for(int i=1;i<=n;i++){
	        arr[i] = sc.nextInt();
        }

	    m = sc.nextInt();

	    int wire,bird;
	    for(int i=0;i<m;i++){
	        wire = sc.nextInt();
	        bird = sc.nextInt();

	        if((wire-1) > 0){
	            arr[wire-1] += bird -1 ;
            }

	        if((wire+1) <=n){
	            arr[wire+1] += (arr[wire] - bird);
            }

	        arr[wire] = 0;

        }

	    for(int i=1;i<=n;i++){
            System.out.println(arr[i]);
        }

    }
}
