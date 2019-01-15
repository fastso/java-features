package effectivejava3rd.enumsandannotations.item38;

import java.util.Arrays;
import java.util.Collection;

//Emulated extensible enum
public enum ExtendedOperation implements Operation {
	EXP("^") {
		public double apply(double x, double y) {
			return Math.pow(x, y);
		}
	},
	REMAINDER("%") {
		public double apply(double x, double y) {
			return x % y;
		}
	};
	private final String symbol;

	ExtendedOperation(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

// // Using an enum class object to represent a collection of extended enums
// public static void main(String[] args) {
//     double x = Double.parseDouble(args[0]);
//     double y = Double.parseDouble(args[1]);
//     test(ExtendedOperation.class, x, y);
// }
// private static <T extends Enum<T> & Operation> void test(
//         Class<T> opEnumType, double x, double y) {
//     for (Operation op : opEnumType.getEnumConstants())
//         System.out.printf("%f %s %f = %f%n",
//                 x, op, y, op.apply(x, y));
// }

	// Using a collection instance to represent a collection of extended enums
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		test(Arrays.asList(ExtendedOperation.values()), x, y);
	}

	private static void test(Collection<? extends Operation> opSet, double x, double y) {
		for (Operation op : opSet)
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
}