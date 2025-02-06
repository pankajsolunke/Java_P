package p_W3;

public class Palindrome {

	public static void main(String[] args) {

		String str = "82828";
		String str1 = str.toLowerCase();
		int l = 0;
		int r = str1.length() - 1;
		boolean p = true;
		while (l < r) {
			if(str1.charAt(l) != str1.charAt(r)) {
				p = false;
			}
			l++;
			r--;
		}
	
		if(p) {
			System.out.println(str + " this String is palindrome ");
		}else {
			System.out.println(str + " this String is Not palindrome ");
		}
		
	}

}
