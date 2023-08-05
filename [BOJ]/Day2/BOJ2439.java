package Day2;

import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //n번째 줄
        int n = sc.nextInt();

        //삼각형 라인의 줄
        for(int i = 1; i <= n; i++){
            //공백을 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //별을 찍을 갯수
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
