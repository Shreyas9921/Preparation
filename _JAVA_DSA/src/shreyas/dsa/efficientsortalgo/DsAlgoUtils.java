package shreyas.dsa.efficientsortalgo;

import java.util.*;

public class DsAlgoUtils {

	public static Integer[] numsArr(Integer size) {
		
		Random random = new Random();
		Integer[] numsArr = new Integer[size];
		
		for(int i = 0; i < size ; i++) {
			numsArr[i] = random.nextInt(100);
		}
		
		return numsArr;
	}
	
	public static Integer[] partitionQuickSort(Integer[] array) {
		return partitionQuickSort(array, 0, array.length -1);
	}
	
	private static Integer[] partitionQuickSort(Integer[] array, Integer lowIndex, Integer highIndex) {
		
		if(lowIndex >= highIndex) {
			return array;
		}
		Integer pivotIndex = partition(array, lowIndex, highIndex);
		
		partitionQuickSort(array, lowIndex, pivotIndex-1);
		System.out.println("Left Partition Sort :: " +Arrays.asList(array));
		partitionQuickSort(array, pivotIndex+1, highIndex);
		System.out.println("Right Partition Sort :: " +Arrays.asList(array));

		
		return array;
	}
	
	private static Integer partition(Integer[] array, Integer lowIndex, Integer highIndex) {
		
		Integer pivot = array[highIndex];
		Integer leftTravPtr = lowIndex;
		Integer rightTravPtr = highIndex-1;
		
		while(leftTravPtr <= rightTravPtr) {
			
			while(leftTravPtr <= rightTravPtr && array[leftTravPtr] <= pivot) {
				leftTravPtr++;
			}
			
			while(leftTravPtr <= rightTravPtr && array[rightTravPtr] >= pivot) {
				rightTravPtr--;
			}
			
			if(leftTravPtr < rightTravPtr) 
				swapIndex(array, leftTravPtr, rightTravPtr);
			System.out.println("Array after every consecutive swap ::" +Arrays.asList(array));
		}
		System.out.println();
		swapIndex(array, leftTravPtr, highIndex);
		System.out.println("Array after every consecutive Partition ::" +Arrays.asList(array));
		
		return leftTravPtr;
	}
	
	private static void swapIndex(Integer[] array, Integer leftTravPtr, Integer rightTravPtr) {
		int temp = array[leftTravPtr];
		array[leftTravPtr] = array[rightTravPtr];
		array[rightTravPtr] = temp;
	}
	
	public static Integer[] quickSort(Integer[] numsArray) {
		return quickSort(numsArray, 0, numsArray.length-1);
	}
	
	private static Integer[] quickSort(Integer[] numsArray, Integer lowIndex, Integer highIndex) {
		
		if(lowIndex >= highIndex) {
			return numsArray;
		}
		Integer pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		Integer pivot = numsArray[pivotIndex];
		System.out.println("Pivot element of current iteration ::" +pivot);
		swap(numsArray, pivotIndex, highIndex);
				
		Integer leftTrav = lowIndex;
		Integer rightTrav = highIndex;
		
		while(leftTrav < rightTrav) {
			while(leftTrav < rightTrav && numsArray[leftTrav] <= pivot) {
				leftTrav++;
			}
			
			while(leftTrav < rightTrav && numsArray[rightTrav] >= pivot) {
				rightTrav--;
			}
			
			swap(numsArray ,leftTrav, rightTrav);
		}
		
		swap(numsArray, rightTrav, highIndex);
		System.out.println("Array after swapping pivot and right value ::" +Arrays.asList(numsArray));
		
		quickSort(numsArray, lowIndex, leftTrav-1);
		quickSort(numsArray, leftTrav+1, highIndex);
		
		return numsArray;
	}
	
	private static void swap(Integer[] numsArray ,Integer leftIndex, Integer rightIndex) {
		Integer temp;
		
		temp = numsArray[leftIndex];
		numsArray[leftIndex] = numsArray[rightIndex];
		numsArray[rightIndex] = temp;
	}
	
}
