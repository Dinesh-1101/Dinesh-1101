package febProgramPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArrayofStringHashSet {

	public static void main(String[] args) {
		String[] arr= {"we","are","are","we","we","good"};
		Set<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);

	}

}
