* Finalizers are unpredictable, often dangerous, and generally unnecessary.
* Cleaners are less dangerous than finalizers, but still unpredictable, slow, and generally unnecessary.
* Never depend on a finalizer or cleaner to update persistent state.
* There is a severe performance penalty for using finalizers and cleaners.
* Finalizers have a serious security problem: they open your class up to finalizer attacks.
* To protect nonfinal classes from finalizer attacks, write a final finalize method that does nothing.

# legitimate uses
* One is to act as a safety net in case the owner of a resource neglects to call its close method. 
* A second legitimate use of cleaners concerns objects with native peers(non-Java). 
