* The class must document its self-use of overridable methods.
* A class may have to provide hooks into its internal workings in the form of judiciously chosen protected methods.
* The only way to test a class designed for inheritance is to write subclasses.
* You must test your class by writing subclasses before you release it.
* Neither clone nor readObject may invoke an overridable method, directly or indirectly.
* Designing a class for inheritance requires great effort and places substantial limitations on the class.
* The best solution to this problem is to prohibit subclassing in classes that are not designed and documented to be safely subclassed.
