package game;

public class Coordinate {
	private int x, y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//accessors
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//mutators
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//toString
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	//equals
	public boolean equals(Object other) {
		int otherX, otherY;
		otherX = ((Coordinate)other).getX();
		otherY = ((Coordinate)other).getY();
		return (x == otherX && y == otherY);
	}
	
}
