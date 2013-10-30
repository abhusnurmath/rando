package cit590;

public class Rectangle {
	// we will talk about private, public, protected later
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int computeArea(){
		return length * breadth;
	}
	
	public int computePerimeter(){
		return 4*(length + breadth);
	}
	
	public boolean isSquare(){
		return false;
	}
	
	public int diagonalLength(){
		return 256;
	}

	public static void main(String[] args) {
		//do something here
	}

	
	// GETTERS AND SETTERS
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
