package technoCredits.multithreading;

public class Employee2 extends Thread {
	
	@Override
	public void run() {
		m2();
	}
	
	void m2() {
		for(int i=101;i<=200;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}
	}
}
