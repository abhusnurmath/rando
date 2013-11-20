package threads;

import java.lang.Thread;

public class SimpleIncrementer implements Runnable{

	Student s;

	public SimpleIncrementer(Student s){
		this.s = s;
	}

	@Override
	public void run() {
		for (int i = 0; i <10; i ++){
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
			s.score = s.score + 1;
		}
	}

}
