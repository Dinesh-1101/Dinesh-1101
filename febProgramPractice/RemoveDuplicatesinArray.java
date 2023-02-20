package febProgramPractice;

import java.util.Arrays;

public class RemoveDuplicatesinArray {

	public static void main(String[] args) {
		int a[]={11,1,2,2,2,3,13,4,41,64,64,5};
		Arrays.sort(a);//1,2,2,2,3,4,5,11,13,41,64,64,1
		for (int i = 0; i< a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					a[j]=100;
				}
			}if (a[i]!=100) {
				System.out.println(a[i]);
			}
		}

	}

}
