package effectivejava3rd.lambdasandstreams.item47;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

//Adapters from stream to iterable and vice-versa
public class Adapters {
	// Adapter from Stream<E> to Iterable<E> (
	public static <E> Iterable<E> iterableOf(Stream<E> stream) {
		return stream::iterator;
	}

	// Adapter from Iterable<E> to Stream<E>
	public static <E> Stream<E> streamOf(Iterable<E> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false);
	}
}