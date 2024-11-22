class Solution {
    public String solution(String[] seoul) {
        String answer1 = "김서방은 ";
        String answer2 = "에 있다";
        int num = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                num = i;
            }
        }
        String str = String.valueOf(num);
        
        
        return answer1+str+answer2;
    }
}