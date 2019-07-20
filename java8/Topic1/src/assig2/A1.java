package assig2;

public class A1 {
	
	public A1() {
		
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("Finalize method called");
		super.finalize();
	}

}
