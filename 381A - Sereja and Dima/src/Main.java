import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int size;
        int sCounter =0, dCounter =0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> card = new ArrayList<>(n);

        boolean s = true, d = false;

        for(int i=0;i<n;i++){
            card.add(sc.nextInt());
        }

        int begin=0, end=n-1;
        int temp=0;

        while (n>0){
            if(card.get(begin) > card.get(end)){
                temp = card.get(begin);
                begin++;
            }
            else if (card.get(begin) <= card.get(end)){
                temp = card.get(end);
                end--;
            }

            if(s == true){
                sCounter+=temp;
                s = false;
                d = true;
            }else if(d == true){
                dCounter +=temp;
                d = false;
                s = true;
            }

            temp = 0;

            n--;
        }

        System.out.println(sCounter+" "+dCounter);
    }
}
