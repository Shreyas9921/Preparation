package shreyas.multithreading;

import java.util.Random;

public class DemoMain {
	
	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();
		int n = random.nextInt(11);
			MultiThreading multiThread1 = new MultiThreading("Shreyas");
			MultiThreading multiThread2 = new MultiThreading("Shubham");

			multiThread1.start();
			Thread.sleep(2000);
			multiThread2.start();
	}
}