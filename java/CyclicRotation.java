import java.util.*;

class Solution {
    public int[] solution(int[] A, int K) {
        List<Integer> arrayList = new ArrayList<Integer>(A.length);
        for (int i : A) arrayList.add(i);
        Collections.rotate(arrayList, K);
        
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
