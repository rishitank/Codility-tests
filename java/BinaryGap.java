class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N).replaceAll("0*$", "");
        String[] zeros = binary.split("1");
        int length = 0;
        
        for (int i = 0; i < zeros.length; i++) {
            int sum = zeros[i].split("0",-1).length-1;
            if (sum != 0 && sum > length) {
                length = sum;
            }
        }
        
        return length;
    }
}
