package febProgramPractice;

public class Fibonacci {

	public static void main(String[] args) {
		int n=8;
		int f=0;
		int s=1;
		
		System.out.println(f);
		System.out.println(s);
		for (int i = 2; i <n; i++) {
			int sum=f+s;
			f=s;
			s=sum;
			System.out.println(sum);
		}


	}

}
