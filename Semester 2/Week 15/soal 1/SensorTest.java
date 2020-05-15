public class SensorTest {
	public static void main(String[] args) {
		System.out.println("\nCreate sensor1:");
		Sensor sensor1 = new Sensor();
		System.out.println("Sensor1 pressure: " + sensor1.getPressure());
		System.out.println("\nCreate sensor2:");
		Sensor sensor2 = new Sensor(-1);
		System.out.println("Sensor2 pressure: " + sensor2.getPressure());
		System.out.println("\nCreate sensor3:");
		Sensor sensor3 = new Sensor(3);
		System.out.println("Sensor3 pressure: " + sensor3.getPressure());
	}
}