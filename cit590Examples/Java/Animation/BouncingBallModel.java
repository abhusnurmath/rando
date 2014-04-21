
import java.awt.Color;
import java.util.Observable;

public class BouncingBallModel extends Observable{
	final int BALL_SIZE = 20;
	int xPosition = 0;
	int yPosition = 0;
	int xLimit, yLimit;
	int xDelta = 6;
	int yDelta = 4;
	
	Color color = Color.red;
	
	int x1,x2;

	public static enum Orientation {LEFT, right, up, down}

	public BouncingBallModel() {
		x1 = 1;
	}
	
	public int square(int x){
		return x*x;
	}
	
	void makeOneStep() {
		xPosition += xDelta;
		//stay within the left boundary
		if (xPosition < 0) {
			xPosition = 0;
			xDelta = -xDelta;
		}
		//stay within the right boundary
		if (xPosition >= xLimit) {
			xPosition = xLimit;
			xDelta = -xDelta;
		}
		//bounce up and down in y
		yPosition += yDelta;
		if (yPosition < 0 || yPosition >= yLimit) {
			yDelta = -yDelta;
			yPosition += yDelta;
		}

		setChanged();
		notifyObservers();
	}
	
	void makeLineBigger(){
		x2++;
	}
	
	void makeLineSmaller(){
		x2--;
	}
	
	public void setLimits(int xLimit, int yLimit){
		this.xLimit = xLimit - BALL_SIZE;
		this.yLimit = yLimit - BALL_SIZE;
	}
	public int getX() {
		return xPosition;
	}
	
	public int getY() {
		return yPosition;
	}
	
	public int getX1(){
		return x1;
	}
	
	public int getX2(){
		return x2;
	}

	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	
	public void setColor(Color color){
		this.color = color;
	}

}
