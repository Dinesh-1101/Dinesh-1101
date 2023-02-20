package febProgramPractice;

public class AverageOfAnArray {

	public static void main(String[] args) {
		int[] arr= {10,22,56,23,67};
		int sum=0;
		double avg;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println(avg);
	}

}
