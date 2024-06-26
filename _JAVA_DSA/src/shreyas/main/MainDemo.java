package shreyas.main;

import java.util.Arrays;
import java.util.Random;

public class MainDemo {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(25);

		System.out.println("Fibonacci sequence up to " + n + " using dynamic programming with memoization:");
		for (int i = 0; i < n; i++) {
			System.out.print(Fibonacci.fibonacciDP(i) + " ");
		}

		System.out.println();


		long[] fibSequence = Fibonacci.fibonacciArray(n);

		System.out.println("Fibonacci sequence up to " + n +" using dynamic programming approach:");
		 	
		for(int i = 0; i < n; i++) 
			System.out.print(Arrays.asList(fibSequence[i]));
	}
}
