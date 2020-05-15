public class Sensor {
	private double pressure;

	Sensor() {
		setPressure(0);
		System.out.println("Pressure set to default 0.");
	}

	Sensor(double pressure) {
		if (setPressure(pressure)) {
			System.out.println("Successfully set pressure.");
		} else {
			System.out.println("Pressure must be positive number.");
		}
	}

	public boolean setPressure(double pressure) {
		if (pressure > 0) {
			this.pressure = pressure;
			return true;
		} else {
			return false;
		}
	}

	public double getPressure() {
		return pressure;
	}
}