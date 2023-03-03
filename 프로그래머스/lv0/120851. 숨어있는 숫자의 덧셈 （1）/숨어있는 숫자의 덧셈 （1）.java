class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0;i<my_string.length();i++){
            int k = my_string.charAt(i) - '0';
            if(1 <= k && k <= 9){
                answer += k;
            }else
                continue;                  
        }
        return answer;
    }
}