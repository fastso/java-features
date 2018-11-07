# Advantages
* Static factory methods have names.
* Static factory methods are not required to create a new object each time they’re invoked.
* Static factory methods can return an object of any subtype of their return type.
* The class of the returned object can vary from call to call as a function of the input parameters.
* The class of the returned object need not exist when the class containing the method is written.

# Disadvantages
* Providing only static factory methods is that classes without public or protected constructors cannot be subclassed.
* Static factory methods are hard for programmers to find.(They do not stand out in API documentation in the way that constructors do.)