* In practice, a class implementing Cloneable is expected to provide a properly functioning public clone method. 
* In effect, the clone method functions as a constructor; you must ensure that it does no harm to the original object and that it properly establishes invariants on the clone.
* the Cloneable architecture is incompatible with normal use of final fields referring to mutable objects.
* Public clone methods should omit the throws clause, as methods that don’t throw checked exceptions are easier to use.
* A better approach to object copying is to provide a copy constructor or copy factory.

