import java.util.Scanner;
public class Main {

    public static String victim1;
    public static String victim2;

    public static void updateValues(String name1, String name2){
        if(victim1.equals(name1)){
            victim1 = name2;
        }
        else if(victim1.equals(name2)) {
            victim1 = name1;
        }
        else if(victim2.equals(name1)){
            victim2 = name2;
        }
        else if(victim2.equals(name2)){
            victim2 = name1;
        }

    }

    public static void print(){
        System.out.println(victim1+" "+victim2);
    }

    public static void main(String[] args) {
        String name1,name2;
        int n;
        Scanner sc = new Scanner(System.in);

        name1 = sc.next();
        name2 = sc.next();
        victim1 = name1;
        victim2 = name2;

        sc.reset();
        n = sc.nextInt();

        for (int i=1;i<=n;i++){
            print();
            sc.reset();
            name1 = sc.next();
            name2 = sc.next();
            updateValues(name1, name2);
        }
        print();

    }
}
