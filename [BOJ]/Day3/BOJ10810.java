package Day3;

import java.util.Scanner;

public class BOJ10810 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //바구니의 총수
        int n = sc.nextInt();
        int[] arr = new int[n];

        //공을 넣으려는 횟수
        int m = sc.nextInt();

        //영역 입력
        for(int a = 0; a < m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int b = i - 1; b < j; b++)
                arr[b] = k;
        }

        for(int c = 0; c < arr.length; c++)
            System.out.print(arr[c] + " ");
    }
}
