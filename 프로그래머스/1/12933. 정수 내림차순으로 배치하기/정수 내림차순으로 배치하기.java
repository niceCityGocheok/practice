import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        answer = Long.valueOf(sb.toString());
        
        return answer;
    }
}