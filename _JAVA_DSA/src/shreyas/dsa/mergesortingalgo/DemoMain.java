package shreyas.dsa.mergesortingalgo;

import java.util.Arrays;

import shreyas.dsa.efficientsortalgo.DsAlgoUtils;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numsArray = DsAlgoUtils.numsArr(10);
		
//		System.out.println("Integer Array before sorting ::" +Arrays.asList(numsArray));
		System.out.println("Array before mergeSort ::" +numsArray);
		Integer[] mergeSort = DsAlgoUtil.mergeSort(numsArray);
		
		System.out.println("Array after mergerSort ::" +mergeSort);
//		System.out.println("Integer Array after sorting ::" +Arrays.asList(mergeSort));

	}

}
