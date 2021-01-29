import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static boolean checkDistinct(int year){
        boolean checked = false;
        String yearStr = year +"";
        Set<Character> yearSet = new HashSet();

        for(int i = 0 ;i<yearStr.length();i++){
            if(yearSet.contains(yearStr.charAt(i))){
                return false;
            }else{
                yearSet.add(yearStr.charAt(i));
            }
        }

        //System.out.println("year String : "+yearStr.length()+" , year Set : "+ yearSet.size());

        if (yearStr.length() == yearSet.size())
            checked = true;

        return checked;
    }

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();

//        for(int i=year+1; i<=9000;i++){
//            if(checkDistinct(i)){
//                System.out.println(i);
//                break;
//            }
//        }

        int i = year+1;
        while(true){
            if(checkDistinct(i)){
                System.out.println(i);
                break;
            }
            i++;

        }

    }
}
