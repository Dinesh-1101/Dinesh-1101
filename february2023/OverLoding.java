package february2023;

public class OverLoding {
	public void getStudentInfo(int id) {
		System.out.println("Total id = "+id);
	}
	public void getStudentInfo(int id,String Name) {
		System.out.println("id= "+id+"Name= "+Name);

	}
	public void getStudentInfo(int id,String Name,String mail) {
		System.out.println("id= "+id+"Name= "+Name+"Mail= "+mail);

	}
	

	public static void main(String[] args) {
		OverLoding concept=new OverLoding();
		concept.getStudentInfo(5);
		concept.getStudentInfo(5, "pooja");
		concept.getStudentInfo(5, "pooja", "jayapriya.27official@gmail.com");


	}

}
