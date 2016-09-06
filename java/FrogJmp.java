class Solution {
    public int solution(int X, int Y, int D) {
        int jumps = 0;
        int diff = Y - X;
        if (X < Y) {
            if (diff % D == 0) {
                jumps = diff / D;
            }
            else {
                jumps = diff / D + 1;
            }
        }
        
        return jumps;
    }
}
