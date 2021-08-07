import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Long p,n;
        Long x;
        Long temp;
        boolean contain = false;
        Set<Long> hash = new HashSet<Long>();
        Scanner sc = new Scanner( System.in );

        p = sc.nextLong();
        n = sc.nextLong();

        for(int i=0;i<n;i++){
            sc.reset();
            x = sc.nextLong();

            temp = x%p;
            if(hash.contains(temp)){
                System.out.println(i+1);
                contain = true;
                break;
            }else{
                hash.add(temp);
            }


        }
        if (!contain)
            System.out.println(-1);

    }
}
