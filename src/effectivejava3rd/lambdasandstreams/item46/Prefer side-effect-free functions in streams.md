* The forEach operation should be used only to report the result of a stream computation, not to perform the computation.
* It is customary and wise to statically import all members of Collectors because it makes stream pipelines more readable.
* There is never a reason to say collect(counting()).
* In order to use streams properly, you have to know about collectors. The most important collector factories are toList, toSet, toMap, groupingBy, and joining.
