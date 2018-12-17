* Use checked exceptions for conditions from which the caller can reasonably be expected to recover.
* Use runtime exceptions to indicate programming errors.
* All of the unchecked throwables you implement should subclass RuntimeException.
