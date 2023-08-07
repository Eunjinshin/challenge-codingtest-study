package Day3;

import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //정수의 갯수
        int n = sc.nextInt();
        int[] arr = new int[n];

        //찾을 정수
        int x = sc.nextInt();

        //배열에 숫자 넣기
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < x)
                System.out.print(arr[i]+" ");
        }

    }
}
