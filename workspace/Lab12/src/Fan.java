
public class Fan {
	public final static int SLOW = 1;
	public final static int MEDIUM = 2;
	public final static int FAST = 3;
	
	private int speed = SLOW;
	private boolean isOn = false;
	private double radius = 5d;
	private String color = "blue";
	
	
	public Fan(int speed, boolean isOn, double radius, String color){
		this.speed = speed;
		this.isOn = isOn;
		this.radius = radius;
		this.color = color;
	}
	
	public Fan(){
		this(SLOW, false, 5d, "blue");
	}
	
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public void turnOn(boolean input){
		isOn = input;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public boolean isOn(){
		return isOn;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public String toString(){
		if(isOn){
			return "Fan Speed: " + this.speed +" Color: " + this.color + " Radius: " + this.radius;
		}else{
			return "Fan Off. Color: " + this.color + " Radius: " + this.radius;

		}
	}
	
	
	
	
	
}
