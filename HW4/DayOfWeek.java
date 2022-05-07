package Homework4;

public class DayOfWeek {
	private int day;
	private String title1;
	private String title2;
	public DayOfWeek(int day, String title1, String title2) {
		this.day = day;
		this.title1 = title1;
		this.title2 = title2;
	}
	@Override
	public String toString() {
		return "DayOfWeek [title1=" + title1 + ", title2=" + title2 + "]";
	}
	
}
