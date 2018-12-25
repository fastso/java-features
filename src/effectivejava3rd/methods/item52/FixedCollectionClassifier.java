package effectivejava3rd.methods.item52;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Repaired  static classifier method.
public class FixedCollectionClassifier {
	public static String classify(Collection<?> c) {
		return c instanceof Set ? "Set" : c instanceof List ? "List" : "Unknown Collection";
	}

	public static void main(String[] args) {
		Collection<?>[] collections = { new HashSet<String>(), new ArrayList<BigInteger>(),
				new HashMap<String, String>().values() };

		for (Collection<?> c : collections)
			System.out.println(classify(c));
	}
}