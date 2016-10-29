package Palindrome;

public class Palindrome {
	public static void main(String[] args) {
		String s = "ABA";
		char[] arr = s.toCharArray();
		System.out.println(palindrome(arr, 0 , arr.length - 1));
	}
	
	public static boolean palindrome(char[] arr, int i, int j) {
		if(arr[i] != arr[j]) {
			return false;
		}
		if(i >= j) {
			return true;
		}
		return palindrome(arr, i + 1, j - 1);
	}

}
