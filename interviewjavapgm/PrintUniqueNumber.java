package interviewjavapgm;

import java.util.Arrays;

public class PrintUniqueNumber {
public static void main(String[] args) {
	int[] num= {1,3,5,6,7,8,2,4,3,5,6,7,7};
	//duplicate 3,5,6,7
	//unique value1,2,3,4,5,6,7,8
	Arrays.sort(num);//sorted value: 1 2 3 3 4 5 5 6 6 7 7 7 8
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {//check if i and j both are same
				num[j]=1000;/*cnhage the j value to 1000: here after that 
				             particuar j value consider as 1000*/
			}
		}
		if(num[i]!=1000) {/*checks that value alredy changed ass 1000 if yes 
		                   it doesnt print that value*/ 
			System.out.print(num[i]);
		}
	}
}
}

