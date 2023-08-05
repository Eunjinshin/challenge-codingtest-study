package Day2;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //입력값이 정수 일경우 true
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println((a + b));
        }

        sc.close();
    }
}
