import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> shoes = new HashSet<>();

        for(int i=0;i<4;i++){
            shoes.add(sc.nextInt());
        }

        System.out.println(4 - shoes.size());
    }
}
