package Day5;

import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //숫자 갯수
        int N = sc.nextInt();
        String M = sc.next();
        //입력된 문자열을 배열로 잘라 넣음
        String[] arr = M.split("");
        int result = 0;

        for(int i = 0; i < N; i++){
            //int로 형변환하여 결과값 출력
            result += Integer.parseInt(arr[i]);
        }

        System.out.println(result);
    }
}
