package febProgramPractice;


public class Example {
	
	public static void main(String[] args) {
		String poov= "I am software a tester";
		String[] split = poov.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length()-1; j >= 0; j--) {
				System.out.print(split[i].charAt(j));
				
			}System.out.print(" ");
			
		}

		}
	}
