package effectivejava3rd.creatinganddestroyingobjects.item1;

public class Main {
	/**
	 * Translates a boolean primitive value into a Boolean object.
	 * 
	 * @param b
	 * @return
	 */
	public static Boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}

	// Static Factories Method Sample
//	Date d = Date.from(instant);
//	Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);
//	BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);	
//	StackWalker luke = StackWalker.getInstance(options);
//	Object newArray = Array.newInstance(classObject, arrayLen);
//	FileStore fs = Files.getFileStore(path);
//	BufferedReader br = Files.newBufferedReader(path);
//	List<Complaint> litany = Collections.list(legacyLitany);

}
