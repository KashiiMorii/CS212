
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("noon")); // true
		System.out.println(isPalindrome("Madam I'm Adam")); // true
		System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // True
		System.out.println(isPalindrome("A Toyota")); //true
		System.out.println(isPalindrome("Not a palindrome"));//false
		System.out.println(isPalindrome("asdfghfdsa"));//false
	}
	
	public static boolean isPalindrome(String in) {
		if(in==null) {
			return false;
		}
		return isPalindromeHelper(in.toUpperCase());
	}
	
	private static boolean isPalindromeHelper(String in) {
		in = in.replaceAll("[^a-zA-Z","");
		in=preprocess(in);
		if(in.length()<=1) {
			return true;
		}
		if(in.charAt(0)!=in.charAt(in.length()-1)) {
			return false;	
		}
		return isPalindromeHelper(in.substring(1,in.length()-1));
	}
	
}
