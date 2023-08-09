package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열로 받음
        //공백으로 구분
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //각각 받은 것을 역순
        //역순으로 만들것을 int로 변환
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(A > B ? A : B);

    }
}
