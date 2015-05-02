

class MyThread1 implements Runnable{
	private int i = 2;
	public void run(){
		System.out.println("i="+i);
	}
}

public class RunnableDemo {
	public static void main(String[] args){
		MyThread1 mt = new MyThread1();
		Thread t1 = new Thread(mt, "thread1");
		t1.start();
	}


}
