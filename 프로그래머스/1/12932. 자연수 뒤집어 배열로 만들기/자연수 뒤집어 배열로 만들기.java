import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String strArrary[] = Long.toString(n).split("");
        int[] answer = new int[strArrary.length];
        int j = 0;
        
        for (int i = strArrary.length-1; i >= 0; i--) {
            answer[j++] = Integer.valueOf(strArrary[i]);
        }
        
        return answer;
    }
}