
import java.util.*;


public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = 
			new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		Integer[] moreInts = {4, 5};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 6, 7);
		List<Integer> list = Arrays.asList(9, 10);
		list.set(1, 99);

	
	}


}
