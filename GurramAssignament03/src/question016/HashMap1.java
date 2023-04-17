package question016;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
		public static void main(String[] args) {
			Map<String,Integer> map1 = new HashMap<String,Integer>();
			map1.put("Ravi", 47);
			map1.put("teja", 443);
			map1.put("gurram", 12);
			map1.put("gdag", 26);
			map1.put(null, null);
			System.out.print("Elements in Hashtable are:\n " + map1.entrySet());
			System.out.println(map1.get("Ravi"));
			System.out.println(map1.get("gurram"));
			}
	}
