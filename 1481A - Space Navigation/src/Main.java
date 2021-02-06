import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Long x,y;
        String orders;

        n = sc.nextInt();




        for (int j=0;j<n;j++){

            x = sc.nextLong();
            y = sc.nextLong();
            orders = sc.next();
            Long startX = Long.valueOf(0);
            Long startY = Long.valueOf(0);

            boolean ignoredY = false;
            boolean ignoredX = false;



            for(int i=0;i<orders.length();i++){


                char ch = orders.charAt(i);

                if(ch == 'U'){
                    if(startY < y){
                        startY++;
                    }else{
                        ignoredY = true;
                    }

                }else if (ch == 'D'){

                    if(startY > y){
                        startY--;
                    }else{
                        ignoredY = true;
                    }

                }else if(ch == 'R'){
                    if (startX < x){
                        startX++;
                    }else{
                        ignoredX = true;
                    }

                }else if(ch == 'L'){
                    if (startX > x){
                        startX--;
                    }else{
                        ignoredX = true;
                    }

                }

            }

            if(ignoredX || ignoredY){
                //System.out.println("StartedX : "+startX+" x : "+x+" , StartedY : "+startY+" y : "+y);
                if(startX == x && startY == y){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                //System.out.println("StartedX : "+startX+" x : "+x+" , StartedY : "+startY+" y : "+y);
                if(startX == x && startY == y){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }



    }
}
