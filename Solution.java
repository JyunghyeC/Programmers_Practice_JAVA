import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "Python";
		
		my_string = my_string.toLowerCase();
		char[] ch = my_string.toCharArray();
		Arrays.sort(ch);
		
		answer = new String(ch);
		
		System.out.println(answer);
	}

}
