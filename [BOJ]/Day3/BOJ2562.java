package Day3;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        //최댓값
        int max = arr[0];
        //위치
        int result = 0;

        //정수 나열(공백구분)
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
                result = i;
            }
        }

        System.out.printf("%d %d", max, result + 1);
    }
}
