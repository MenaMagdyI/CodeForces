import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int max =0;
        int addedValues = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];

        if(n == 1){
            System.out.println(0);
        }else{
            for(int i=0;i<n;i++){
                sc.reset();
                arr[i] = sc.nextInt();
                if(arr[i]>max)
                    max = arr[i];
            }

            for (int i=0;i<n;i++){
                int temp = max - arr[i];
                addedValues +=temp;
            }
            System.out.println(addedValues);

        }
    }
}
