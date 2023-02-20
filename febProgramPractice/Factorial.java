package febProgramPractice;

public class Factorial {

	public static void main(String[] args) {
		int factorial=6;
		int store=1;
		for (int i = factorial; i >=1; i--) {
			store=store*i;
		}System.out.println("fact of 6 = "+store);
		

	}

}
