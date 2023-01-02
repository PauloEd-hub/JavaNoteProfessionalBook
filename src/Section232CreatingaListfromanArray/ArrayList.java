package Section232CreatingaListfromanArray;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList {

	public static void main(String[] args) {
		
		// Using Arrays.asList()
		
		String[] stringArray = {"foo", "bar", "baz"};
		List<String> stringList = new java.util.ArrayList<String>(Arrays.asList(stringArray));
		
		//Using Arrays.asList()

		String[] stringArrayy = {"foo", "bar", "baz"};
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(stringArrayy));
		
		
		// Using Collections.addAll()
		String[] stringArry = {"foo", "bar", "baz"};
		java.util.ArrayList<String> list3 = new java.util.ArrayList();
		Collection.addAll(list, stringArray);
		
		
		//Using Streams
		int[] ints = {1, 2, 3}
		List<Integer> list4  = Arrays.stream(ints).boxed().collect(Collectors.toList());
		
		String[] stringArray2 = {"foo", "bar","baz"};
		List<Object> list5 = Arrays.stream(stringArray2).collect(Collectors.toList()); 

	}

}
