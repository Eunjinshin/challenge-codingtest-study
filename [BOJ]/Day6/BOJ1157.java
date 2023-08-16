package Day6;

import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //단어 입력
        String word = sc.nextLine();

        int[] arr  = new int[26]; // 영문자의 개수는 26개

        for (int i = 0; i < word.length(); i++){

            // 대문자 범위
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                // 해당 알파벳의 인덱스의 값 1 증가
                arr[word.charAt(i) - 'A']++;
            }

            else {	// 소문자 범위
                arr[word.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                // 대문자로 출력해야하므로 65를 더해준다.
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
