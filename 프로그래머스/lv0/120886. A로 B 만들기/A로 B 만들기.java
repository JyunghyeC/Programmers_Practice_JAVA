import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        String be = new String(b);
        String af = new String(a);
        
        if(be.equals(af))
            return 1;
        else
            return 0;
    }
}