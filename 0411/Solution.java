public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        //s문자열에 있는 문자열을 소문자로 변경
        s = s.toLowerCase();

        //문자열을 배열로 변환
        char[] arr = s.toCharArray();

        int p = 0;
        int y = 0;

        for(int i = 1; i <= s.length(); i++){
            if(arr[i] == 'p') p++;
            else y++;   
        }

        if(p == y)
            answer = true;
        else
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String input1 = "pPoooyY";
        boolean expected1 = true;
        boolean result1 = s.solution(input1);
        System.out.println("Test Case 1 - Expected: " + expected1 + ", Result: " + result1);
    }
}