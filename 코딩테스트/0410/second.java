class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
 
        for(int i = 0; i < n; i++){
            //1부터 시작 1x ~
            answer[i] = (long) x * (i + 1); 
        }
        return answer;
    }
}