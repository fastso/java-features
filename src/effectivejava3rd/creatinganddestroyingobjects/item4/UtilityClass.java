package effectivejava3rd.creatinganddestroyingobjects.item4;

public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		// Not must
		throw new AssertionError();
	}
}
