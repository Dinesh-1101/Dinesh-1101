package interviewjavapgm;

public class FibonacciSeries {
public static void main(String[] args) {
// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
int range=8;
int first=0;
int second=1;
int sum=0;//0 1 1 2 3 5 8 13 21
			// Print first number
			System.out.println(first);
			System.out.println(second);
			// Iterate from 1 to the range
			// add first and second number assign to sum
				 sum=first+second;
			// Assign second number to the first number
                first=second;
			// Assign sum to the second number
		
			for (int i = 1; i <=range; i++) {
			second=sum;
			// print sum
			System.out.println(sum);}
}
}
