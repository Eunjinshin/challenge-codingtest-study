package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //시험 본 과목 수
        int n = sc.nextInt();
        float[] arr = new  float[n];
        
        //시험 점수 보정
        float result = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextFloat();
        }

        Arrays.sort(arr);

        //평균 내자
        for(int j = 0; j < n; j++){
            result += (arr[j] / arr[arr.length-1] * 100);
        }

        System.out.println(result / n);

    }
}
