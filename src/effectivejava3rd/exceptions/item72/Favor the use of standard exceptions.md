* Do not reuse Exception, RuntimeException, Throwable, or Error directly. 
* IllegalArgumentExceptionNon-null
parameter value is inappropriate.
* IllegalStateExceptionObject
state is inappropriate for method invocation.
* NullPointerExceptionParameter
value is null where prohibited.
* IndexOutOfBoundsExceptionIndex
parameter value is out of range.
* ConcurrentModificationExceptionConcurrent
modification of an object has been detected where it is prohibited.
* UnsupportedOperationExceptionObject
does not support method.
* Throw IllegalStateException if no argument values would have worked, otherwise throw IllegalArgumentException.
