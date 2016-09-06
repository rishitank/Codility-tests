import java.util.*;

class Solution {
    public int solution(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        long leftSum = 0;
        long sum = Arrays.stream(A).mapToLong(i -> i).sum();
        for (int P = 0; P < A.length; P++) {
            long rightSum = sum - leftSum - (long)A[P];
            if (leftSum == rightSum) {
                return P;
            }
            leftSum += (long)A[P];
        }
        
        return -1;
    }
}
