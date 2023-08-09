package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 입력
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        System.out.println(st.countTokens());
    }
}
