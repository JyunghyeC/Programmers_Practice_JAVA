class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = Integer.toString(num);
        String ks = Integer.toString(k);
        
        if(str.indexOf(ks) == -1)
            answer = -1;
        else
            answer = str.indexOf(ks) + 1;
         
                return answer;
        }

    }
