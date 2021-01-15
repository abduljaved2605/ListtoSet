package arraytoset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listToSet = new ArrayList<String>();
		listToSet.add("Apple");
		listToSet.add("Andriod");
		listToSet.add("Andriod");
		listToSet.add("Andriod");
		listToSet.add("Andriod");

		Set<String> setList = new HashSet<String>(listToSet);
		for(String sl:setList)
		{
			System.out.println("New***"+sl);
		}
		
		

	}

}
