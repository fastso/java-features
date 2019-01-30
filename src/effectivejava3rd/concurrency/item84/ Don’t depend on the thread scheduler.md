* Any program that relies on the thread scheduler for correctness or performance is likely to be nonportable.
* Threads should not run if they aren’t doing useful work.
* Resist the temptation to “fix” the program by putting in calls to Thread.yield.
* Thread.yield has no testable semantics. 
* Thread priorities are among the least portable features of Java. 
