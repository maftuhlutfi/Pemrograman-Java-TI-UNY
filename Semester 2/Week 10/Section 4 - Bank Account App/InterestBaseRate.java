public interface InterestBaseRate {
	// Return interest base rate
	default double getBaseRate() {
		return 2.5;
	}
}