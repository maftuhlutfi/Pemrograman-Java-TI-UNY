/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class soal_9_8 {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);

		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}
}

class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	// Constructor
	Fan() {

	}

	// Acessor
	int getSpeed() {
		return this.speed;
	}

	boolean getOn() {
		return this.on;
	}

	double getRadius() {
		return this.radius ;
	}

	String getColor() {
		return this.color;
	}

	// Mutator
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void setOn(boolean on) {
		this.on = on;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	void setColor(String color) {
		this.color = color;
	}

	// toString method
	public String toString() {
		if (on) {
			return "The fan speed: " + speed + " , color: " + color +" , radius: " + radius;
		}
		else {
			return "The fan color: " + color +" , radius: " + radius + ". Fan is off";
		}
	}
}


/*

======
OUTPUT
======
The fan speed: 3 , color: yellow , radius: 10.0
The fan color: blue , radius: 5.0. Fan is off

*/