package Day4;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ10811 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //바구니 갯수
        int n = sc.nextInt();
        //역순 정렬 횟수
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) { // M개의 줄
            int left = sc.nextInt() - 1; // 배열 0부터 시작
            int right = sc.nextInt() - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        sc.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");

    }
}
