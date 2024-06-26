package shreyas.dsa.practice;

import java.util.*;

public class DsAlgoUtil {
	
	/*
	 * ArrayList Collection of Integers
	 */
	public static List<Integer> numsList(Integer numCount) {
		
		List<Integer> arrList = new ArrayList<>(numCount);
		
		for(Integer i = 1; i <= numCount; ++i) {
			arrList.add(i);
		}
		Collections.shuffle(arrList);
		return arrList;	
	}
	
	/*
	 * Array[Integer] Type
	 */
	public static Integer[] array(Integer eleCount) {
		
		Integer[] arr = new Integer[eleCount];
		Random random = new Random();
		
		int i = 0;
		while(i < arr.length) {
//			Integer ele = random.nextInt(i, eleCount);
//			arr[i] = ele;
			arr[i] = random.nextInt(20);
			i++;
		}
		
		return arr;	
	}
	
	/*
	 * Recursive Approach - Binary Search
	 */
	
	static int steps = 0;
	
	public static Integer binarySearch(Integer[] array, Integer target, Integer left, Integer right) {
		
		Integer mid = (left+right)/2;
		
		if(left <= right) {
			steps++;
			if(array[mid] == target) {
				System.out.println("Number of Recursive Calls ::" +steps);
				return mid;
			}

			else if (array[mid] < target) return binarySearch(array, target, mid+1, right);
			
			else return binarySearch(array, target, left, mid-1);
		}
		System.out.println("Number of Recursive Calls ::" +steps);
		return null;
	}
	
	/*
	 * Linear search

	public static Integer[] linearSearch(Integer[] array, Integer target) {
		Integer[] resultSet = new Integer[2];
		
		int iteration = 0;
		for(int i = 0; i < array.length; i++) {
			iteration++;
			if(array[i] == target) {
				resultSet[0] = i;
				resultSet[1] = iteration;
				return resultSet;
			}
		}
		return null;
	}
	*/

	/*
	 * Binary search

	public static Integer[] binarySearch(Integer[] array, Integer target) {
		
		Integer[] resultSet = new Integer[2];
		
		int iter = 0;

		int left = 0;
		int right = array.length-1;
		
		while(left <= right) {
			iter++;
			int mid = (left+right)/2;
						
			if(array[mid] == target) {
				resultSet[0] = mid;
				resultSet[1] = iter;
				return resultSet;
			}
			
			else if(array[mid] < target) left = mid+1;
			
			else right = mid-1;
		}
		
		return null;
	}
	*/
}
