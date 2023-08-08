package Day4;

import java.util.Scanner;

public class BOJ2743 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 수
        int T = sc.nextInt();
        String[] arr = new String[T];

        for(int i = 0; i < T; i++){
            arr[i] = sc.next();
        }

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j].charAt(0));
            System.out.println(arr[j].charAt(arr[j].length() - 1));
        }
    }
}
