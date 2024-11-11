package day03;

public class Question04 {

	public static void main(String[] args) {
		String s = "ststs";
		System.out.println("Is Pallindrome: "+isPallindrome(s));
	}

	private static boolean isPallindrome(String s) {
		if (s.length() < 2) {
			return true;
		}
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
