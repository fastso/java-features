package effectivejava3rd.methods.item52;

//Classification using method overrriding
class Champagne extends SparklingWine {
	@Override
	String name() {
		return "champagne";
	}
}