
public class Test {

	public static void main(String[] args) {
		
		String word = "abcd efgh";
		System.out.println(reverse(word));
		
	}
	
	
	public static String reverseByWord(String word) {
		if(word == null || word.isEmpty())
	}
	
	public static String reverse(String word) {
		if(word == null || word.isEmpty())
			return null;
		char[] chars = word.toCharArray();
		for(int i=0, j= chars.length-1; i < j; i++, j--) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
	}

}
