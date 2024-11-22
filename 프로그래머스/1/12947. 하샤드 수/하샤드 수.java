class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int xx = x;
        while(true){
            sum += xx % 10;
            if(xx < 10){
                break;
            }
            xx /= 10;
        }
        if(x % sum == 0){
            return true;
        }
        return answer;
    }
}