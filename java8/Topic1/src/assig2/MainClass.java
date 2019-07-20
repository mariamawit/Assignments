package assig2;

public class MainClass {
	
	public static void main(String args[]) {
		A1 a = new A1();
		a = new A1();
		a = new A1();
		
		Runtime.getRuntime().gc();
	}

}
