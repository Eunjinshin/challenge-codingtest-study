package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        //단어
        String s = sc.nextLine();

        //찾을 알파벳 순서
        int i = sc.nextInt();

        System.out.println(s.substring(i - 1,i));
    }
}
