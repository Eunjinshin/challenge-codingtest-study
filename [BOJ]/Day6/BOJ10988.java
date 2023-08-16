package Day6;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int result = 1;
        String word = sc.nextLine();
        String[] str = word.split("");
        //문자열의 맨 뒷 부분
        int last = str.length - 1;

        for(int i = 0; i < str.length; i++,last--){
            if(!str[i].equals(str[last])) {
                result = 0;
                break;
            }
            if(i == last)
                break;
        }

        System.out.println(result);
    }
}
