/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */
import java.util.*;
public class TestMyPoint {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a set of coordinates:");
		double x1 = stdin.nextDouble();
		double y1 = stdin.nextDouble();
		
		MyPoint first = new MyPoint(x1, y1);
		
		System.out.println("Enter another set of coordinates:");
		double x2 = stdin.nextDouble();
		double y2 = stdin.nextDouble();
		
		System.out.println("Distance from (" + first.getX() + "," + first.getY() + ") and points (" +
		x2 + "," + y2 + ") = " + first.distance(x2, y2));
		
		MyPoint second = new MyPoint(x2, y2);
		System.out.println("Distance from (" + first.getX() + "," + first.getY() + ") and MyPoint (" +
				second.getX() + "," + second.getY() + ") = " + first.distance(x2, y2));
	}
}
