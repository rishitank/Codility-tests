import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] A) {
        boolean[] matches = new boolean[A.length+1];
        IntStream.of(A).forEach(elem -> {
            if (elem > 0 && elem <= A.length) {
                matches[elem] = true;
            }
        });
        
        for (int i = 1; i < matches.length; i++) {
            if (!matches[i]) {
                return i;
            }
        }
        
        return A.length + 1;
    }
}
