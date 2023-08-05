package Day2;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //문제의 정수
        int n = sc.nextInt();

        int count = n / 4 ;
        for(int i = 0; i < count; i++){
            System.out.print("long ");
        }

        System.out.print("int");

    }
}
