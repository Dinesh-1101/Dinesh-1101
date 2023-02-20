package febProgramPractice;

public class ArrayContains {
	public boolean contains(int arr[],int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (ele==arr[i]) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		ArrayContains j=new ArrayContains();
		int[] hii= {1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
		System.out.println(j.contains(hii, 256));
		
}
}