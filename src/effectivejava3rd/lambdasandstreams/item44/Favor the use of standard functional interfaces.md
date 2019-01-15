* If one of the standard functional interfaces does the job, you should generally use it in preference to a purpose-built functional interface.

## The six basic functional interfaces

| Interface | Function Signature | Example |
----|----|----
| UnaryOperator<T> | T apply(T t) | String::toLowerCase |
| BinaryOperator<T> | T apply(T t1, T t2) | BigInteger::add |
| Predicate<T> | boolean test(T t) | Collection::isEmpty |
| Function<T,R> | R apply(T t) | Arrays::asList |
| Supplier<T> | T get() | Instant::now |
| Consumer<T> | void accept(T t) | System.out::println |

* Don’t be tempted to use basic functional interfaces with boxed primitives instead of primitive functional interfaces.
* Always annotate your functional interfaces with the @FunctionalInterface annotation.
