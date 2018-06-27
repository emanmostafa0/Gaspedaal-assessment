package GasPedaalSelfDriving;


public class Car {

	//position x
	private int x;
	//position y
	private int y;
	//direction (N,E,S,W)
	private char direction;
	
	public Car() 
	{}
	
	public Car(int x,int y,char direction)
	{
		this.x=x;
		this.y=y;
		this.direction=direction;
	}
	
	//getter and setter x
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	//getter and setter y
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//getter and setter direction
	public char getDirection() {
		return direction;
	}
	public void setDirection(char direction) {
		this.direction = direction;
	}
}
