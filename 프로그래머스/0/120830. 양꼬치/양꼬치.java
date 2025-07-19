class Solution {
    public int solution(int n, int k) {
        int a = 12000; // 양꼬치
        int b = 2000;  // 음료수
        int answer = (a * n) + (b * k); // 총합

        if (n >= 10) {
            answer -= 2000 * (n/10);
        }
        
        return answer;
    }
}