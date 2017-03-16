
public class Circle2D {

	private double x;
	private double y;
	private double radius;
	
	public Circle2D(){
		x = 0;
		y = 0;
		radius = 1;
	}
	
	public Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.pow(radius,2) * Math.PI;
	}
	
	public double getPerimeter(){
		return Math.PI * 2 * radius;
	}
	
	public boolean contains(double x, double y){
		if(Math.sqrt(Math.pow(x,2) + Math.pow(y, 2)) <= radius){
			return true;
		}return false;
	}
	
	
	
}

	
