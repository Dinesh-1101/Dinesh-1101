package febProgramPractice;

public class PrintPrymid4 {

	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int l = i; l <=n; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}for (int p =2; p <=n; p++) {
			for (int u = n; u>=p; u--) {
				System.out.print(" ");

			}for (int j = 1; j <=p; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//		output
//		 * * * * * 
//		  * * * * 
//		   * * * 
//		    * * 
//		     * 
//		    * * 
//		   * * * 
//		  * * * * 
//		 * * * * * 

	}

}
