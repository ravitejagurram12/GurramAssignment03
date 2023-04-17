package question14;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraySyncMethod2 {
	
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("Ravi");
		data.add("teja");
		data.add("Gurram");
    System.out.println("Syncronized arraylist elements are  :");

    Iterator<String> itr = data.iterator();
    while (itr.hasNext())
        System.out.println(itr.next());
	}


}
