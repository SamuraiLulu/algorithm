package programmers.level1.x만큼간격이있는n개의숫자;

class Solution {
    public long[] solution(int x, int y) {
        long[] answer = new long[y];
		long sum = 0;
		for (int i = 0; i < y; i++)
		{
            sum += x;
			answer[i] = sum;
		}
        return answer;
    }
}
