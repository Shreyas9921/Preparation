package shreyas.multithreading;

public class MultiThreading extends Thread {
	
	String threadName;
	
	public MultiThreading(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Concurrent Thread execution " + threadName + " instance count " + i);
			System.out.println();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

