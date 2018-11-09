package effectivejava3rd.creatinganddestroyingobjects.d;

public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		// Not must
		throw new AssertionError();
	}
}
