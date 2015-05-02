public class Thread_1 {
	public static void main(String[] args){
		System.out.println(" Thread test ");
		Thread_1 test = new Thread_1();
		MyThread thread =  test.new MyThread();
		thread.start();
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println("Main Thread ");
		thread.interrupt();
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			try {
				System.out.println("enter sleeping");
				Thread.currentThread().sleep(10000);
				System.out.println("awake");
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			}
		}
	}

}
