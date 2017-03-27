import java.util.Calendar;

/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	
	public Time(long elapsedTime){
		long totalSeconds = elapsedTime / 1000;
		long time_second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long time_minutes = totalMinutes % 60;
		long totalhours = totalMinutes / 60;
		long time_hour = totalhours % 24;
		hour = (int) time_hour;
		minute = (int) time_minutes;
		second = (int) time_second;
	}
	
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setTime(long elapsedTime){
		long totalSeconds = elapsedTime / 1000;
		long time_second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long time_minutes = totalMinutes % 60;
		long totalhours = totalMinutes / 60;
		long time_hour = totalhours % 24;
		hour = (int) time_hour;
		minute = (int) time_minutes;
		second = (int) time_second;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	
	
	
}
