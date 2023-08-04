package Day1;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int minPass = sc.nextInt();

        min += minPass;

        if(min >= 60){
            hour += min / 60;
            min = min % 60;
        }
        if(hour >= 24){
            hour -= 24;
        }

        System.out.printf("%d %d",hour,min);
    }
}
