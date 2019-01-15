package effectivejava3rd.lambdasandstreams.item45;

import java.util.ArrayList;
import java.util.List;

//Generating the Cartesian product of two lists using iteration and streams
public class Card {
	public enum Suit {
		SPADE, HEART, DIAMOND, CLUB
	}

	public enum Rank {
		ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	private final Suit suit;
	private final Rank rank;

	@Override
	public String toString() {
		return rank + " of " + suit + "S";
	}

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;

	}

	private static final List<Card> NEW_DECK = newDeck();

	// Iterative Cartesian product computation
	private static List<Card> newDeck() {
		List<Card> result = new ArrayList<>();
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				result.add(new Card(suit, rank));
		return result;
	}

// // Stream-based Cartesian product computation
// private static List<Card> newDeck() {
//     return Stream.of(Suit.values())
//             .flatMap(suit ->
//                     Stream.of(Rank.values())
//                             .map(rank -> new Card(suit, rank)))
//             .collect(toList());
// }

	public static void main(String[] args) {
		System.out.println(NEW_DECK);
	}
}