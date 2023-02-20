package febProgramPractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=1634;
		int reminder;
		int result=0;
		int orginal=num;

		while (num>0) {
			reminder=num%10;
			result=result+reminder*reminder*reminder*reminder;
			num=num/10;
		}
		if(result==orginal) {
			System.out.println("The given number is ArmStrongNumber  "+ orginal);
		}else 
		{System.out.println("The given number is not ArmStrongNumber");
	}
	}

}
