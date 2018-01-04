class T extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.print(i);
		System.out.println("---");
	}
}

class R implements Runnable {
	public void run() {
		for (char c = 'A'; c <= 'Z'; c++)
			System.out.print(c);
		System.out.println("***");

	}
}

public class JavaSimpleThread2 {
	public static void main(String[] args) {
		new Thread(new R()).start();
		new T().start();
		new Thread(new R()).start();
		new T().start();
		for (char c = 'a'; c <= 'z'; c++)
			System.out.print(c);
		System.out.println("+++");

	}
}
