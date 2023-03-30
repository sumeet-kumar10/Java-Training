package Exercise2;

class Table {
	 static void printTable(String s) {

		System.out.println("[-----" + s + "-----]");
	}
}

class MyThread1 extends Thread {
	public void run() {
		Table.printTable("Hello");
	}
}

class MyThread2 extends Thread {
	public void run() {
		Table.printTable("Java");
	}
}

class MyThread3 extends Thread {
	public void run() {
		Table.printTable("Program");
	}
}

class MyThread4 extends Thread {
	public void run() {
		Table.printTable("World");
	}
}

public class Main {
	public static void main(String t[]) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		t1.start();
		t1.join(0);
		t2.start();
		t3.start();
		t4.start();
	}
}