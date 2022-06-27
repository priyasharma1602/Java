package corejava;

public class ThreadExp1 extends Thread {

	// Initiated run method for thread
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(200);
			} catch (InterruptedException i1) {
				i1.printStackTrace();
			}
			System.out.println("Welcome");
			i++;

		}
	}

	public static void main(String[] args) {

		ThreadExp1 th = new ThreadExp1();
		// Invoking Thread
		th.start();

	}
}