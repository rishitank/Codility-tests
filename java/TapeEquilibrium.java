import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] A) {
        int minimum = 0;
        int leftSum = A[0];
        if (A == null || A.length == 0) {
            return minimum;
        }
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        int rightSum = list.subList(1, A.length).stream().mapToInt(Integer::intValue).sum();
        minimum = Math.abs(leftSum - rightSum);
        
        for (int P = 1; P < A.length; P++) {
            int diff = Math.abs(leftSum - rightSum);
            
            if (diff < minimum) {
                minimum = diff;
            }
            leftSum += A[P];
            rightSum -=A[P];
        }
        
        return minimum;
    }
}
