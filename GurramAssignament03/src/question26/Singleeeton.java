package question26;

public class Singleeeton {
	private static volatile Singleeeton obj = null;
	private Singleeeton() {
		
	}
	public static Singleeeton getInstance() {
		if(obj==null) {
			synchronized (Singleeeton.class) {
				if(obj==null) {
					obj = new Singleeeton();
				}
				
			}
		}
		return obj;
	}
}


