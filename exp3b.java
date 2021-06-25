import java.util.Random;

class A extends Thread {
	public void run() {
		System.out.println("Generating five random numbers... ");
		Random m = new Random();
		for(int i=0;i<5;i++) {
			int num = m.nextInt(10);
			System.out.println(num);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
}

class B extends Thread {
	int n;
	B(int num) {
		n = num;
	}
	
    public void run() {
		System.out.println("Square of " + n + " is " + (n*n));
	}
}

class C extends Thread {
	int n;
	C(int num) {
		n = num;
	}
	
    public void run() {
		System.out.println("Cube of " + n + " is " +(n*n*n));
	}
}

public class exp3b {
	public static void main(String args[]) {
		A t1 = new A();
		B t2 = new B(5);
		C t3 = new C(10);
		t1.start();

		try {
			t1.join();
		}

		catch(InterruptedException e) {}
		t2.start();
		t3.start();
	}
}