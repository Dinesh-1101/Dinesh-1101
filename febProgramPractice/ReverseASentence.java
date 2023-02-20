package febProgramPractice;

public class ReverseASentence {

	public static void main(String[] args) {
		String poov= "I like u but same as i love"
				+ " u too what can i do";
		String[] split=poov.split(" ");
		for (int i = split.length-1; i >= 0; i--) {
			System.out.print(split[i]+" ");
			
		}

	}

}
