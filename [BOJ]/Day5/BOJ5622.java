package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value;
        int count = 0;

        while(true) {

            value = System.in.read();

            if(value == '\n') {
                break;
            }

            //A ~ Z 의 경우 int 값으로는 65 ~ 90
            if(value < 68) count += 3;
            else if(value < 71) count += 4;
            else if(value < 74) count += 5;
            else if(value < 77) count += 6;
            else if(value < 80) count += 7;
            else if(value < 84) count += 8;
            else if(value < 87) count += 9;
            else count += 10;


        }
        System.out.print(count);
    }
}
