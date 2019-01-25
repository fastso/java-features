* Given the difficulty of using wait and notify correctly, you should use the higher-level concurrency utilities instead.
* It is impossible to exclude concurrent activity from a concurrent collection; locking it will only slow the program.
* Use ConcurrentHashMap in preference to Collections.synchronizedMap.
* For interval timing, always use System.nanoTime rather than System.currentTimeMillis.
* Always use the wait loop idiom to invoke the wait method; never invoke it outside of a loop. 
* There is seldom, if ever, a reason to use wait and notify in new code. 
