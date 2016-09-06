import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] A) {
        int sum = IntStream.rangeClosed(1, A.length + 1).sum();
        int missing = Arrays.stream(A).reduce(sum, (a, b) -> a - b);
        
        return missing;
    }
}
