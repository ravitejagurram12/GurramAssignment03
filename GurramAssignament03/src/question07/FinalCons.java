package question07;

public class FinalCons {

	
	       public final String name;
			public final int age;
			 	
			public FinalCons () {
				this.name = "Ravi";
				this.age = 23;
			}
			
			public void display() {
			    System.out.println("Student: "+this.name );
			    System.out.println("Age of Student: "+this.age );
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				new FinalCons().display();
			}
			
}
