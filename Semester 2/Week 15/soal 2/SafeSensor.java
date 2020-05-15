public class SafeSensor extends Sensor {
	private double max;

	SafeSensor(double max) {
		this.max = max;
		if (setPressure(10)) {
			super.setPressure(10);
		}
	}

	SafeSensor(double max, double pressure) {
		this.max = max;
		if (setPressure(pressure)) {
			super.setPressure(pressure);
		}
	}

	public boolean setPressure(double pressure) {
		if (pressure <= max) {
			return true;
		} else {
			System.out.println("Pressure is exceeds safe pressure.");
			return false;
		}
	}

	public double getMax() {
		return max;
	}
}