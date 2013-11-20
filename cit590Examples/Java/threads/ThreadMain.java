package threads;

public class ThreadMain {
	public static void main(String[] args) {
		Student s = new Student("Yang", 25);
		SimpleIncrementer t1 = new SimpleIncrementer(s);
		SimpleScorePrinter t2 = new SimpleScorePrinter(s);
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
	}
}
