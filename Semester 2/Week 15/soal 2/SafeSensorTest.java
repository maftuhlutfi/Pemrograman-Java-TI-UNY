public class SafeSensorTest{
	public static void main(String[] args) {
		System.out.println("Create SafeSensor1:");
		SafeSensor safe1 = new SafeSensor(15);
		System.out.println("SafeSensor1 max: " + safe1.getMax());
		System.out.println("SafeSensor1 pressure: " + safe1.getPressure());

		System.out.println("\nCreate SafeSensor2:");
		SafeSensor safe2 = new SafeSensor(5);
		System.out.println("SafeSensor2 max: " + safe2.getMax());
		System.out.println("SafeSensor2 pressure: " + safe2.getPressure());

		System.out.println("\nCreate SafeSensor3:");
		SafeSensor safe3 = new SafeSensor(5, 7);
		System.out.println("SafeSensor3 max: " + safe3.getMax());
		System.out.println("SafeSensor3 pressure: " + safe3.getPressure());

		System.out.println("\nCreate SafeSensor4:");
		SafeSensor safe4 = new SafeSensor(7, 5);
		System.out.println("SafeSensor4 max: " + safe4.getMax());
		System.out.println("SafeSensor4 pressure: " + safe4.getPressure());
	}
}