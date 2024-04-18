package shreyas.dsa.efficientsortalgo;

import java.util.Arrays;

public class DemoMainSort {
	
	public static void main(String[] args) {
		
		Integer[] numsArray = DsAlgoUtils.numsArr(10);
		
		System.out.println("Integer Array before sorting ::" +Arrays.asList(numsArray));
		
		Integer[] quickSort = DsAlgoUtils.quickSort(numsArray);
//		Integer[] quickSort = DsAlgoUtils.partitionQuickSort(numsArray, 0, numsArray.length-1);

		System.out.println("Integer Array after sorting ::" +Arrays.asList(quickSort));
	}

}
