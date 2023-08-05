package Day2;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //n번째 줄
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
