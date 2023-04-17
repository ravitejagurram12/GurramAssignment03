package question1;

public class Genrics<P> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Genrics p1 = new Genrics();
		p1.setName("Ravi");
		System.out.println(p1);
	}

	private P name;

	public P getName() {
		return name;
	}

	public void setName(P name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name= " + name;
	}
}
