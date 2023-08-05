package Day2;

import java.util.Scanner;

public class BOJ25304 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //영수증에 적힌 총 금액
        int x = sc.nextInt();
        //영수증에 적힌 구매한 물건의 종류의 수
        int n = sc.nextInt();

        //총액
        int sum = 0;

        //계산
        for(int i=0; i < n; i++) {
            sum += sc.nextInt() * sc.nextInt();
        }
        if(x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
