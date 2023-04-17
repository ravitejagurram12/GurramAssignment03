package question24;

public class Garbagee {
	protected void finalize() throws Throwable{
		System.out.println("Finalize called,hence garbage collector triggered");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbagee temp = new Garbagee();
		System.out.println("Calling garbage collector before making null");
		System.gc();
		temp = null;
		System.out.println("Calling garbage collector after making null");
		System.gc();
	}
		

	}

