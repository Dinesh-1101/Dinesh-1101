package febProgramPractice;

public class Palindrome {
	private  static void reverse(String n) {
		String r="";
		for (int i = n.length()-1; i >= 0; i--) {
			r=r+n.charAt(i);
		}
		if (r.equalsIgnoreCase(n)) {
			System.out.println(n+" is palindrome=  "+  r);
		}else {
			System.out.println(n+" is not a palindrome=  "+  r);
		}
	}
	

	public static void main(String[] args) {
		String name="Malayalam";
		reverse(name);
		System.out.println("       Thank you                  ");
//		String name="Malayalam";
//		String result="";
//		for (int i = name.length()-1; i >= 0; i--) {
//			result=result+name.charAt(i);
//			
//		}
//		if (result.equalsIgnoreCase(name)) {
//			System.out.println(name+" is palindrome=  "+  result);
//		}else {
//			System.out.println(name+" is not a palindrome=  "+  result);
//		}
		
		
	}

}
