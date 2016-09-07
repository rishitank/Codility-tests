import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        Map<Integer, Integer> covered = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < A.length; i++) {
            if (!covered.containsKey(A[i])) {
                covered.put(A[i], i);
            }
            
            if (covered.size() == X) {
                return i;
            }
        }
        
        return -1;
    }
}
