//배열 회전시키기

import java.util.ArrayList;

public class Solution02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        
        if(direction.equals("right")){
            int r = list.get(list.size() - 1);
            list.add(0, r);
            list.remove(list.size() - 1);
        }else{
            int l = list.get(0);
            list.add(list.size(), l);
            list.remove(0);
        }
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
       
		
	}

}
