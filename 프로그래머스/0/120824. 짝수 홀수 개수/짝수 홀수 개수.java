class Solution {
	public int[] solution(int[] num_list) {
		int a = 0; // 짝수
		int b = 0; // 홀수

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) { // 짝수일 때
				a++;
			} else
				b++;
		}

		int[] answer = new int[2];

		answer[0] = a;
		answer[1] = b;

		return answer;
	}
}