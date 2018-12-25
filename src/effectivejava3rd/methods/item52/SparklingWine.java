package effectivejava3rd.methods.item52;

//Classification using method overrriding
class SparklingWine extends Wine {
	@Override
	String name() {
		return "sparkling wine";
	}
}