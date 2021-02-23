import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        ArrayList<Integer> soldiers = new ArrayList<>(n);
        int max=0,min=Integer.MAX_VALUE;
        int maxIndex=0,minIndex=0;
        int temp;
        for(int i=0;i<n;i++){
            temp = sc.nextInt();
            if(temp>max){
                max = temp;
                maxIndex = i;
            }
            if(temp<min){
                min = temp;
                minIndex = i;
            }
            soldiers.add(temp);
        }
        int seconds =0;
        while(maxIndex>=1){
            int swap = soldiers.get(maxIndex);
            soldiers.set(maxIndex, soldiers.get(maxIndex-1));
            soldiers.set(maxIndex-1,swap);
            seconds++;
            maxIndex--;

        }

        minIndex = soldiers.indexOf(min);
        int finalMinIndex=0;
        for(int i=minIndex;i<n;i++){
            if(min == soldiers.get(i)){
                finalMinIndex = i;
            }
        }
        while(finalMinIndex<= n-2){
            int swap = soldiers.get(finalMinIndex);
            soldiers.set(finalMinIndex, soldiers.get(finalMinIndex+1));
            soldiers.set(finalMinIndex+1,swap);
            seconds++;
            finalMinIndex++;
        }

        System.out.println(seconds);

    }
}
