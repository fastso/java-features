package interfaces.a;

public interface Truck extends Vehicle {
	int getPayloadPounds();

	default int getPayloadKg() {
		return convertPoundsToKg(getPayloadPounds());
	}

	default int getWeightKg(int pounds) {
		return convertPoundsToKg(pounds);
	}

	/**
	 * A private interface method not used by other methods of the same interface
	 * does not make sense. (Since Java 9)
	 * 
	 * @param pounds
	 * @return
	 */
	private int convertPoundsToKg(int pounds) {
		return (int) Math.round(0.454 * pounds);
	}

	static int convertKgToPounds(int kilograms) {
		return (int) Math.round(2.205 * kilograms);
	}
}
