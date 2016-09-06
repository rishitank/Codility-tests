import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] A, int K) {
        List<Integer> arrayList = Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.rotate(arrayList, K);
        
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
