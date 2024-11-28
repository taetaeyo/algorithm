class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String concat = "";
        concat = String.valueOf(a) + String.valueOf(b);
        
        int multiplication = 2 * a * b;
        
        if(Integer.parseInt(concat) < multiplication) {
            answer = multiplication;
        } else {
            answer = Integer.parseInt(concat);
        }
         
        return answer;
    }
}