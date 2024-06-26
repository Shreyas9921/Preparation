package shreyas.dsa.practice;

import java.util.*;

public class DemoDsAlgo {
	
	public static void main(String[] args) {
		
		Random random = new Random();

		/*
		 * Collection - ListOf Integers object of capacity 10;
		 */
//		List<Integer> arrList = DsUtil.numsList(10);
//		Collections.sort(arrList);	
//		System.out.println(arrList);
		
		/*
		 * Array - DS
		 */
		Integer[] array = DsAlgoUtil.array(20); 		
		Arrays.sort(array);		
		System.out.println(Arrays.asList(array));
		
		Integer target = random.nextInt(0, 25);
		System.out.println("Element to Found :: " +target);
		
//		Integer left = 0;
//		Integer right = array.length -1;
		Integer result = DsAlgoUtil.binarySearch(array, target, 0, array.length -1);
		
		if(result != null) {
			System.out.println("Using binary Search Element " +target + " found at index ::" + result);
		} else {
			System.out.println("Element " +target + " not found");
		}

		
//		Integer targetBinary = random.nextInt(0, 10);
//		Integer target = array[25000];
		
//		Integer[] resultLinear = DsAlgoUtil.linearSearch(array, target);
//		Integer[] resultBinary = DsAlgoUtil.binarySearch(array, target);

//		Integer[] resultBinary = DsUtil.binarySearch(array, targetBinary);

		/*
		 * 
		if(resultLinear != null) {
			System.out.println("Using Linear Search Element " +target + " found at index ::" +resultLinear[0] + " In " +resultLinear[1] + " Iteration");
		} else {
			System.out.println("Element " +target + " not found");
		}
		
		if(resultBinary != null) {
			System.out.println("Using Binary Search, Element " +target + " found at index ::" +resultBinary[0] + " In " +resultBinary[1] + " Iteration");
		} else {
			System.out.println("Element " +target + " not found");
		}
		*/

	}

}
