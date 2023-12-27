package ch14.sec07.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThred();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		
		thread.interrupt();
	}

}
