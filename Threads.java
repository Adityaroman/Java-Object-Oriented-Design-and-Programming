//vvi TOpic
//whithout creating parent class we can use or create child class and use
//thread is having multiple methods but in sylabus only two(start and sleep)
//what is method how to create it
package mypackage;

class MyThread extends Thread{    //thread class(only Thread is correct here only no other names)by default Thread is a parent class here
	public void start() {
//		System.out.println("Thread is Starting...");
		for(int i = 0;i<5;i++){
			System.out.println("Thread is Starting..."+i);
			try {
				Thread.sleep(5000);  //50000 = 5 seconds
			}
			catch(InterruptedException e) {
				System.out.println("Thread is Not Starting..."+e);
			}
		}
	}
}

public class Threads {         //main class
	
	public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start();
        System.out.println("Thread Exicution is Completed..");
	}

}

