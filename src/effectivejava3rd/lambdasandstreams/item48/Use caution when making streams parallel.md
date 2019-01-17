* Parallelizing a pipeline is unlikely to increase its performance if the source is from Stream.iterate, or the intermediate operation limit is used.
* Do not parallelize stream pipelines indiscriminately.
* Performance gains from parallelism are best on streams over ArrayList, HashMap, HashSet, and ConcurrentHashMap instances; arrays; int ranges; and long ranges.
* Not only can parallelizing a stream lead to poor performance, including liveness failures; it can lead to incorrect results and unpredictable behavior.
* Under the right circumstances, it is possible to achieve near-linear speedup in the number of processor cores simply by adding a parallel call to a stream pipeline. 
