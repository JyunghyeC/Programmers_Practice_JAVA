import java.util.Arrays;

public class Solution03 {

	public static void main(String[] args) {
		int[] emergency = {3,76,24};
		
		int[] answer = new int[emergency.length];
        int[] tmp = new int[emergency.length];
        
        for(int i=0;i<=emergency.length - 1;i++){
            tmp[i] = emergency[i];
        }
        
        Arrays.sort(tmp);   
        
        for(int i=0;i<=answer.length - 1;i++){
            for(int j=0;j<=emergency.length -1;j++){
                if(tmp[i] == emergency[j])
                    answer[j] = emergency.length - i;
            }
        }
        
        return answer;
	}

}
