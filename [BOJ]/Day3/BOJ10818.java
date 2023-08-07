package Day3;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //정수의 갯수
        int n = sc.nextInt();
        int[] arr = new int[n];

        //정수 나열(공백구분)
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //최댓값
        int max = arr[0];
        //최솟값
        int min = arr[0];

        for(int i = 1; i < n; i++){
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }

        System.out.printf("%d %d", min, max);
    }
}
