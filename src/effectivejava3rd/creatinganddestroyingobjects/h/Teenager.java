package effectivejava3rd.creatinganddestroyingobjects.h;

//Ill-behaved client of resource with cleaner safety-net
public class Teenager {
	public static void main(String[] args) {
		new Room(99);
		System.out.println("Peace out");

		// Uncomment next line and retest behavior, but note that you MUST NOT depend on
		// this behavior!
//   System.gc();
	}
}