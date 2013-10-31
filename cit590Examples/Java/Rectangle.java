package cit590;

public class Rectangle {
	// we will talk about private, public, protected later
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	/**
	 * this is an example of default arguments
	 * and one constructor calling another.
	 * we will get into this later on in this class
	 * @param length
	 */
	public Rectangle(int length){
		this(length, 1);
	}
	
	public int computeArea(){
		return length * breadth;		
	}
	
	public int computePerimeter(){
		return 4*(length + breadth);
	}
	
	public boolean isSquare(){
		return this.length == this.breadth;
	}
	
	public double diagonalLength(){
		return Math.sqrt(length * length + breadth * breadth);
	}
	

	public static void main(String[] args) {
		//do something
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
