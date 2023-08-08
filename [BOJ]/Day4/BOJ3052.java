package Day4;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> h = new HashSet<Integer>();

        int result = 0;

        for (int i = 0; i < 10; i++){
            h.add(sc.nextInt() % 42);
        }

        sc.close();
        System.out.print(h.size());
    }
}
