package Day2;

import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 갯수
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": "+ a + " + " + b + " = " + (a + b));
        }
    }
}
