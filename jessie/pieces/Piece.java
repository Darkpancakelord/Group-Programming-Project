package pieces;
import game.*;

public abstract class Piece {
	protected Coordinate position;
	boolean isAlive;
	
	public Piece(Coordinate position) {
		this.position = position;
		isAlive = true;
	}
	
	//accessors
	public int getX() {
		return position.getX();
	}
	
	public int getY() {
		return position.getY();
	}
	
	public Coordinate getPosition() {
		return position;
	}
	
	public boolean getIfAlive() {
		return isAlive;
	}
	
	//mutator
	public void setX(int x) {
		position.setX(x);
	}
	
	public void setY(int y) {
		position.setY(y);
	}
	
	public void setPosition(int x, int y) {
		position.setX(x);
		position.setY(y);
	}
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	//abstract methods
	
	//checks if the path is valid for the piece, finalPosition refers to the potential end coordinate
	public abstract boolean isValidPath(Coordinate finalPosition);
	
	//returns an array of the starting and ending position of a movement, starting position is the current position
	public abstract Coordinate[] drawPath(Coordinate finalPosition);
	
	//returns the type of a piece
	public abstract Type getType();
	
	//move from one coordinate to another
	public abstract void moveTo(Coordinate newPosition);
	
}
