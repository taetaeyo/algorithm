class Solution {
    public int solution(int n) {
        int x = 1;
        
        while (n > 0) {
            if (n % x == 1) {
                break;
            }
            x++;
        }
        
        return x;
    }
}