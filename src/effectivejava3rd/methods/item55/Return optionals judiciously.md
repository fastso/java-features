* Never return a null value from an Optional-returning method.
* Optionals are similar in spirit to checked exceptions.
* Container types, including collections, maps, streams, arrays, and optionals should not be wrapped in optionals.
* You should declare a method to return Optional<T> if it might not be able to return a result and clients will have to perform special processing if no result is returned. 
* You should never return an optional of a boxed primitive type.
* It is almost never appropriate to use an optional as a key, value, or element in a collection or array.
