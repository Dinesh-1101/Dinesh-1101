package febProgramPractice;

public class RemoveDuplicatesStringSentence {

	public static void main(String[] args) {
		String poov= "I like u but same as i love"
				+ " u too what can i do";
		int count=0;
		String[] sp=poov.split(" ");
		for (int i = 0; i < sp.length; i++) {
			for (int j = i+1; j < sp.length; j++) {
				if (sp[i].equalsIgnoreCase(sp[j])) {
					sp[j]="";
					count++;
				}
			}
		}if (count>=1) {
			for (int k = 0; k < sp.length; k++) {
				System.out.print(sp[k]+" ");
			}
		}
		}

	}


