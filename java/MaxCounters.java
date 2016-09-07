import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currentMin = 0, max = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (counters[A[i]-1] < currentMin) {
                    counters[A[i]-1] = currentMin;
                }
                counters[A[i]-1]++;
                if (counters[A[i]-1] > max) {
                    max = counters[A[i]-1];
                }
            } else {
                currentMin = max;
            }
        }
        
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < currentMin) {
                counters[i] = currentMin;
            }
        }
        
        return counters;
    }
}
