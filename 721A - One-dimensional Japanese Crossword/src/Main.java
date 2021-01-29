import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        String crossWord;
        Scanner sc = new Scanner(System.in);

        char prevStatus;
        int blackGroups = 0;
        int groupCount = 0;
        ArrayList<Integer> countStock = new ArrayList<>();

        n = sc.nextInt();
        crossWord = sc.next();

        prevStatus = crossWord.charAt(0);
        if(prevStatus == 'B'){
            blackGroups++;
            groupCount++;
            if(n==1){
                countStock.add(groupCount);
            }
        }

        for(int i=1;i<n;i++){
            if(crossWord.charAt(i) == 'B'){
                if(prevStatus == 'B'){
                    groupCount++;

                }else if(prevStatus=='W'){
                    groupCount++;
                    blackGroups++;
                    prevStatus = 'B';

                }
                if(i == n-1)
                    countStock.add(groupCount);
            }
            else if(crossWord.charAt(i) == 'W'){
                if(groupCount > 0)
                    countStock.add(groupCount);
                groupCount = 0;
                prevStatus = 'W';

            }
        }

        System.out.println(blackGroups);
        for (int i=0;i<countStock.size();i++){
            System.out.print(countStock.get(i)+" ");
        }
    }
}
