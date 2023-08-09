package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //테스트 케이스 수
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            //문자열 입력
            String[] str = br.readLine().split(" ");

            //반복 수
            //문자열에서 첫번째 int를 빼내기
            int R = Integer.parseInt(str[0]);
            
            //나머지 문자열 대입
            String S = str[1];

            //문자열 순회
            for(int j = 0; j < S.length(); j++){
                //해당 문자를 반복
                for(int k = 0; k < R; k++)
                    System.out.print(S.charAt(j));
            }

            System.out.println();
            
        }
    }
}
