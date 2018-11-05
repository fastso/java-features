package interfaces.a;

public interface Truck extends Vehicle {
	int getPayloadPounds();

	/**
	 * Default Method of Interface<br>
	 * If the class implements it, the interface's default implementation is ignored
	 * and overridden by the class implementation.<br>
	 * Since Java 8<br>
	 * 
	 * @return
	 */
	default int getPayloadKg() {
		return convertPoundsToKg(getPayloadPounds());
	}

	default int getWeightKg(int pounds) {
		return convertPoundsToKg(pounds);
	}

	/**
	 * Private Method of Interface<br>
	 * A private interface method not used by other methods of the same interface
	 * does not make sense.<br>
	 * Since Java 9<br>
	 * 
	 * @param pounds
	 * @return
	 */
	private int convertPoundsToKg(int pounds) {
		return (int) Math.round(0.454 * pounds);
	}

	/**
	 * Static Method of Interface<br>
	 * A static method of an interface cannot be overridden by the class that
	 * implements this interface<br>
	 * Since Java 8<br>
	 * 
	 * @param kilograms
	 * @return
	 */
	static int convertKgToPounds(int kilograms) {
		return (int) Math.round(2.205 * kilograms);
	}
}
