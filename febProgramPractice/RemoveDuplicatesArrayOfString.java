package febProgramPractice;
public class RemoveDuplicatesArrayOfString {

	public static void main(String[] args) {
		String[] arr= {"we","are","are","we","we","good"};
		int length = arr.length;
		String[] arr2=new String[length];
		int temp=0;
		for (int i = 0; i < length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				arr2[temp]=arr[i];
				temp++;
			}

		}arr2[temp++]=arr[length-1];
		for (int k = 0; k < temp; k++) {
			//System.out.println(Arrays.toString(arr2));
			System.out.println(arr2[k]);
		}
	}

}


