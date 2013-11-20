package threads;

public class SimpleScorePrinter implements Runnable{
	Student s;

	public SimpleScorePrinter(Student s){
		this.s = s;
	}

	@Override
	public void run() {
		for (int i=0; i <10; i++){
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
			System.out.println(s.name + " " + s.score);
		}
	}

}
