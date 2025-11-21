package assignment;

public enum DayOfTheWeek {
	sunday("sun", "orange"), monday("moon", "white"), tuesday("mars", "red"), wednesday("mercury", "green"), thursday("jupiter", "yellow"), friday("venus", "white"), saturday("saturn", "blue");
	String owner;
	String color;
	DayOfTheWeek(String x, String y){
		owner=x;
		color=y;
	}
	public void display() {
		System.out.println("Owner: "+owner+ ", Color: "+color);
	}
}
