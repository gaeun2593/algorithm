class Solution {
    public int solution(int n, int t) {
        double a = Math.pow(2, t);
        int answer = n * (int)a;
        return answer;
    }
}