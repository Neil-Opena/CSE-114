/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

public class TestTime {
	public static void main(String[] args){
		Time first = new Time();
		Time second = new Time(555550000);
		Time third = new Time(4,20,0);
		System.out.println("First: " + first.getHour() + ":" + first.getMinute() + ":" + first.getSecond());
		System.out.println("Second: " + second.getHour() + ":" + second.getMinute() + ":" + second.getSecond());
		//System.out.println("Third: " + third.getHour() +":" + third.getMinute() + ":" + third.getSecond());
		//third.setTime(555550000);
		//System.out.println("Third: " + third.getHour() +":" + third.getMinute() + ":" + third.getSecond());
	}
}
