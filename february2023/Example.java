package february2023;

public class Example {
	int length;
	int breath;
	int height;
	
	public  Example() {
		length = 1;
		breath=1;
		height=1;
	}
	public Example(int i,int j,int z) {
		length=i;
		breath=j;
		height=z;

	}
	public Example(int i) {
		length=breath=height=i;

	}

	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example(5,6,7);
		Example e3=new Example(10);
		System.out.println(e2.breath);
		System.out.println(e3.length);
		System.out.println(e1.height);

	}

}
