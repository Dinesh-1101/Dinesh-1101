package febProgramPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUnSortedArrayHashSet {

	public static void main(String[] args) {
		int a[]={11,1,2,2,2,3,13,4,41,64,64,5};
		Set<Integer>set1=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set1.add(a[i]);		
		}
		for (Integer integer : set1) {
			System.out.println(integer);
		}
		System.out.println(set1);
		

	}

}

