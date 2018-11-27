# Telescoping constructor pattern
* it is hard to write client code when there are many parameters, and harder still to read it.

# JavaBeans pattern
* Because construction is split across multiple calls, a JavaBean may be in an inconsistent state partway through its construction. 
* It precludes the possibility of making a class immutable and requires added effort on the part of the programmer to ensure thread safety.

# Builder pattern
* It is well suited to class hierarchies.

# Summary
the Builder pattern is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters, especially if many of the parameters are optional or of identical type.
