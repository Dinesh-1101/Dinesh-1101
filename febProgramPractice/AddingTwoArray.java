package febProgramPractice;

import java.util.Arrays;

public class AddingTwoArray {

	public static void main(String[] args) {
		int[] jp= {1,4,2,5,3,6,4,7};
		int[] riya= {9,7,8,4,5};
		int length=jp.length+riya.length;
		int[] fam=new int[length];
		for (int i = 0; i < jp.length; i++) {
			fam[i]=jp[i];
		}
		for (int i =0; i < riya.length; i++) {
			fam[i+jp.length]=riya[i];
		}
		String string = Arrays.toString(fam);
		System.out.println(string);

	}


}