import java.util.*;
import java.util.stream.*;

class Solution {
    public static <T> boolean containsUnique(List<T> list) {
        return list.stream().distinct().count() == list.size();
    }
    
    public int solution(int[] A) {
        boolean isDistinct = Solution.containsUnique(IntStream.of(A).boxed().collect(Collectors.toList()));
        long sum = LongStream.rangeClosed(1, A.length).sum();
        long arrSum = Arrays.stream(A).mapToLong(i -> i).sum();
        
        if (sum == arrSum && isDistinct) {
            return 1;
        } else {
            return 0;
        }
    }
}
