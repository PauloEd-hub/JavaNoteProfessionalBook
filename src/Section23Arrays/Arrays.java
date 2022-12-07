package Section23Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Arrays {

	public static void main(String[] args) {
		
		//Section 23.1: Creating and Initializing Arrays
		
		//Basics cases
		int[] numbers1 = new int[3];          // Array for 3 int values, default value is 0
		int[] numbers2 = {1, 2, 3};           // Array literal of 3 int values
		int[] numvers3 = new int[] {1, 2, 3};   // Array of 3 int values initialized
		int[][] numbers4 = {{1, 2}, {3, 4, 5}};  // Jagged array literal
		int[][] numbers5 = new int[5][]; 		// Jagged array, one dimension 5 long
		int[][] numbers6 = new int[5][4];		// Multidimensional array: 5x4
		
		
		//Arrays may be created using any primitive or reference type.
		
		float[] boats = new float[5];	// Array of five 32-bit floating point numbers.
		double[] header = new double[] { 4.56, 332.267, 7.0, 0.3367, 10.0 }; // Array of five 64-bit floating point numbers.
		String[] theory = new String[] {"a","b","c"}; // Array of three strings (reference type).
		Object[] dArt = new Object[] {new Object(), "We love Stack Overflow", new Integer(3) };
	
		
		//Arrays, Collections, and Streams
		
		// Auto-boxing happening for int 127 here
		Integer[] initial = {127, Integer.valueOf(42)};
		List<Integer> toList = java.util.Arrays.asList(initial);
		
		// Note: Works with all collections
		Integer[] fromCollection = toList.toArray(new Integer[toList.size()]);
		
		//Java doesn't allow you to create an array of a parameterized type
		List<String>[] list = new ArrayList<String>[2]; //Compilation error!
		
		
		// Streams - JDK 8+
		Stream<Integer> toStream = java.util.Arrays.stream(initial);
		Integer[] fromStream = toStream.toArray(Integer[]::new);
	
	
	
	
	
	
	
	
	
	
	}

}
