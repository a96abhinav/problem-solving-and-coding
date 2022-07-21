
public class StringSubstring {

	public static void main(String[] args) {
		
		String s = "Abhinav";
		String result = "";
		int m= 2;
		int n=3;
		int count = 0;
		
		while(!s.equals(result)) {
			System.out.println("--->count "+(count+1));
			if(count == 0) {
				result = s;
			}
			result = result.substring(s.length()-m, s.length())+result.substring(0, s.length()-m);
			System.out.println(result);
			result = result.substring(s.length()-n, s.length())+result.substring(0, s.length()-n);
			System.out.println(result);
			count++;
		}
		
	}
}
