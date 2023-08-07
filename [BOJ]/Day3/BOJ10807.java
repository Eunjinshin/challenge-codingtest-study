package Day3;

import java.util.Scanner;

public class BOJ10807 {
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

        //찾을 정수
        int v = sc.nextInt();

        int result = 0;

        for(int j = 0; j < arr.length; j++){ // 배열 길이만큼 반복문 돌리면서 변수 b 와 같은
            if(v == arr[j]){				 // 숫자 찾기. 같으면 count 변수 1씩 증가
                result++;
            }
        }


        System.out.println(result);
    }
}
