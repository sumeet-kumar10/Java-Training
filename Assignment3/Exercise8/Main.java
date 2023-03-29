package Exercise8;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("A");

		MyThread t1 = new MyThread(sb1);
		MyThread t2 = new MyThread(sb1);
		MyThread t3 = new MyThread(sb1);

		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThread extends Thread {
	StringBuffer sb1;

	MyThread(StringBuffer sb1) {
		this.sb1 = sb1;
	}

	public void run() {

		synchronized (sb1) {

			for (int i = 0; i < 100; i++) {
				System.out.println(sb1);
			}

			char ch = sb1.charAt(0);
			sb1.setCharAt(0, ++ch);
		}
	}
}
