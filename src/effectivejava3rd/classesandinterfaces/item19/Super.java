package effectivejava3rd.classesandinterfaces.item19;

//Class whose constructor invokes an overridable method. NEVER DO THIS!
public class Super {
	// Broken - constructor invokes an overridable method
	public Super() {
		overrideMe();
	}

	public void overrideMe() {
	}
}
