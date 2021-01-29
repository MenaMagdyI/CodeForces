import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrOfCalories = new int[4];
        String movies;
        int tempInt;
        int caloriesCount = 0;

        arrOfCalories[0] = sc.nextInt();
        arrOfCalories[1] = sc.nextInt();
        arrOfCalories[2] = sc.nextInt();
        arrOfCalories[3] = sc.nextInt();

        sc.reset();
        movies = sc.next();

        for (int i=0;i<movies.length();i++){
            tempInt = Integer.parseInt(movies.charAt(i)+"");
            caloriesCount += arrOfCalories[tempInt-1];

        }


        System.out.println(caloriesCount);


    }
}
