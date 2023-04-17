package question1;

public class GenricMethod {

	public static <Demo> void printArray(Demo[] input) {
		
		for(Demo print: input) {
			System.out.print(print + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] names = {"Ravi", "teja"};
		System.out.println("Generic method has: ");
		printArray(names);
	}

}
