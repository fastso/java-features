* Synchronization is required for reliable communication between threads as well as for mutual exclusion.
* Do not use Thread.stop.
* Synchronization is not guaranteed to work unless both read and write operations are synchronized.
* Confine mutable data to a single thread.
* when multiple threads share mutable data, each thread that reads or writes the data must perform synchronization. 
