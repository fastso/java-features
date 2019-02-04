package effectivejava3rd.serialization.item89;

import java.util.Arrays;

//Enum singleton - the preferred approach
public enum Elvis {
	INSTANCE;
	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
}