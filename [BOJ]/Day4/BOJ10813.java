package Day4;

import java.util.Scanner;

public class BOJ10813 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //바구니의 총수
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp;

        //공을 넣으려는 횟수
        int m = sc.nextInt();

        //영역 입력
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;                     // 배열의 index 는 0 부터 시작 [0,1,2,3,4,5]
        }

        for(int a = 0; a < m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(int c = 0; c < arr.length; c++)
            System.out.print(arr[c] + " ");
    }
}
