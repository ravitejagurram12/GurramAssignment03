package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraySync {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		list1.add("ravi");
		list1.add("teja");
		list1.add("gurram");
		
		
		list1 = Collections.synchronizedList(list1);
		synchronized(list1) {
			Iterator<String> itr = list1.listIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

}
