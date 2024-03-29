import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int casher = sc.nextInt();
	    int peopleNumber[] = new int[casher+1];

	    for(int i=1;i<=casher ;i++){
	        peopleNumber[i] = sc.nextInt();
        }

	    int min = Integer.MAX_VALUE;
	    for(int i=1;i<= casher;i++){
	        int queueTime = 0;
	        for(int j=1;j<=peopleNumber[i];j++){
	            int temp = sc.nextInt();
	            queueTime += (temp * 5);
            }
	        queueTime += (peopleNumber[i]*15);
			//System.out.println("queueTime "+i+" : "+queueTime);
	        if(queueTime < min){
	            min = queueTime;
            }
        }

        System.out.println(min);
    }
}
