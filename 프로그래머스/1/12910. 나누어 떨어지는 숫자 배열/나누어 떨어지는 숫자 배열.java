import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num % divisor == 0){
                list.add(num);
            }}
            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        
        if(list.isEmpty()){
            return new int[]{-1};   
        }
        Arrays.sort(answer);
            
            return answer;
    }
        
}
        


