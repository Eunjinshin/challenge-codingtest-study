package Day1;

import java.util.Scanner;

public class BOJ14681 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int reault = 0;

        if(x > 0 && y > 0)
            reault = 1;
        else if(x < 0 && y > 0)
            reault = 2;
        else if(x < 0 && y < 0)
            reault = 3;
        else
            reault = 4;


        System.out.println(reault);

    }
}
