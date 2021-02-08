import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        String input;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        input = sc.next();

        int firstHalfSum =0, secondHalfSum=0;
        boolean checkNotLucky = false;

        for(int i = 0;i<n;i++){
            int temp = Character.getNumericValue(input.charAt(i));
            if(temp != 4 && temp !=7){
                checkNotLucky = true;
                System.out.println("NO");
                break;
            }

            if(i<n/2){
                firstHalfSum+= temp;

            }else if(i>=n/2){
                secondHalfSum +=temp;
            }
        }

        if(!checkNotLucky){
            if (firstHalfSum == secondHalfSum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
