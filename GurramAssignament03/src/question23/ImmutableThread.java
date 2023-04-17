package question23;

public class ImmutableThread {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ravi";
		name.concat("Teja");
		System.out.println("name : " +name);
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				name.concat("t1");
				System.out.println("Thread: " +name);
				
			}

		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				name.concat("t2");
				System.out.println("Thread1 : " +name);
				
			}
			
		});
		t1.start();
		t2.start();

}
}
