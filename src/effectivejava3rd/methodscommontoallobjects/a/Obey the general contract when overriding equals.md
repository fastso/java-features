# No need override "equals"
* Each instance of the class is inherently unique.
* There is no need for the class to provide a “logical equality” test. 
* A superclass has already overridden equals, and the superclass behavior is appropriate for this class.
* The class is private or package-private, and you are certain that its equals method will never be invoked.

# Contract of override "equals"
* Reflexive: For any non-null reference value x, x.equals(x) must return true.
* Symmetric: For any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true.
* Transitive: For any non-null reference values x, y, z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) must return true.
* Consistent: For any non-null reference values x and y, multiple invocations of x.equals(y) must consistently return true or consistently return false, provided no information used in equals comparisons is modified.
* For any non-null reference value x, x.equals(null) must return false.

# a recipe for a high-quality equals method
* Use the == operator to check if the argument is a reference to this object.
* Use the instanceof operator to check if the argument has the correct type.
* Cast the argument to the correct type.
* For each “significant” field in the class, check if that field of the argument matches the corresponding field of this object.

# Caveats
* Always override hashCode when you override equals.
* Don’t try to be too clever.
* Don’t substitute another type for Object in the equals declaration.
