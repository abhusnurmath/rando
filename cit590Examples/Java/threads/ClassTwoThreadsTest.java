package threads;

class TwoThreadsTest {
    public static void main (String args[]) {
    	SimpleThread t1 = new SimpleThread("590");
    	SimpleThread t2 = new SimpleThread("592");
        t1.start();
        t2.start();
    }
}