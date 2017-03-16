/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

public class MyPoint {

	private double x;
	private double y;
	
	public MyPoint(){
		x = 0;
		y = 0;
	}
	
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double distance(MyPoint temp){
		return(Math.sqrt(Math.pow(x-temp.getX(),2) + Math.pow(y-temp.getY(), 2)));
	}
	
	public double distance(double x, double y){
		return(Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y, 2)));
	}
}
