## All five kinds of method references:

| Method Ref Type | Example | Lambda Equivalent |
----|----|----
| Static | Integer::parseInt | str -> Integer.parseInt(str) |
| Bound | Instant.now()::isAfter | Instant then = Instant.now(); t -> then.isAfter(t) |
| Unbound | String::toLowerCase | str -> str.toLowerCase() |
| Class Constructor | TreeMap<K,V>::new | () -> new TreeMap<K,V> |
| Array Constructor | int[]::new | len -> new int[len] |

* Where method references are shorter and clearer, use them; where they aren’t, stick with lambdas.
