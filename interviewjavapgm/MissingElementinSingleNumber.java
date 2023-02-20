package interviewjavapgm;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementinSingleNumber {
public static void main(String[] args) {
	// Here is the input
			int[] arr = {1,2,3,5,4,6,8};

			// Sort the array	1234568
           Arrays.sort(arr);	
           System.out.println(arr.length);

	// loop through the array (start i from arr[0] till the length of the array)
    for (int i = 0; i < arr.length; i++) {
    	// check if the iterator variable is not equal to the array values respectively
		//System.out.println(arr[i]);
	if(i+1!=arr[i]) {
	System.out.println(i+1);
	
		break;
	}
    }
				
				
					
}
}
