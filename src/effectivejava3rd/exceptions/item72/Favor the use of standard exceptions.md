* Do not reuse Exception, RuntimeException, Throwable, or Error directly. 
* IllegalArgumentException Non-null
parameter value is inappropriate.
* IllegalStateException Object
state is inappropriate for method invocation.
* NullPointerException Parameter
value is null where prohibited.
* IndexOutOfBoundsException Index
parameter value is out of range.
* ConcurrentModificationException Concurrent
modification of an object has been detected where it is prohibited.
* UnsupportedOperationException Object
does not support method.
* Throw IllegalStateException if no argument values would have worked, otherwise throw IllegalArgumentException.
