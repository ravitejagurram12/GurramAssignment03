package question19;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread t = new ExtendsThread();
		t.start();
		
		System.out.println("Starting Main Thread...");
		Runnablee th = new Runnablee();
		Thread t1 = new Thread(th);
		t1.start();
		System.out.println("End of Main Thread...");

}
}