
import java.util.Observable;

public class BouncingBallModel extends Observable{
	final int BALL_SIZE = 20;
	int xPosition = 0;
	int yPosition = 0;
	int xLimit, yLimit;
	int xDelta = 6;
	int yDelta = 4;


	public BouncingBallModel() {
		// TODO Auto-generated constructor stub
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

}
