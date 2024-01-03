package SearchAlgos;

import java.util.HashMap;

public class HashSearch_Algorithms {

	public static void main(String[] args) {
		HashIntSearch();
	}
	
	public static void HashIntSearch() {
		
		HashMap<Integer,String> hash = new HashMap<Integer,String>();		
		hash.put(0,null);
		hash.put(1,null);
		hash.put(4,null);
		hash.put(1,"yu");		
		if(hash.containsKey(1)) {
			System.out.println(hash.get(1));
		}else {
			System.out.println("No result");
		}
	}

}
