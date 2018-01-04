class A implements Runnable {
	public void run() {
		while(T.x <= 10){
			System.out.print(T.x);
			T.x++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class B extends Thread {
	public void run() {
		while(T.x <= 10){
			System.out.println(T.x);
			T.x++ ;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class T {
	static public Integer x=0;
	public static void main(String[] args) {
		new Thread(new A()).start();
		new B().start();
//		System.exit(0); 
	}
}
