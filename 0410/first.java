class Solution {
    public int solution(int n) {
        int answer = 0;

        //약수 판별
        for(int i = 1; i <= n; i++){
            //약수일 경우 answer에 더함
            if(n % i == 0)
                answer += i;
        }

        return answer;
    }
}