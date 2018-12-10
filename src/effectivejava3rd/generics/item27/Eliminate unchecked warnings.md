* Eliminate every unchecked warning that you can.
* If you can’t eliminate a warning, but you can prove that the code that provoked the warning is typesafe, then (and only then) suppress the warning with an @SuppressWarnings("unchecked") annotation.
* Always use the SuppressWarnings annotation on the smallest scope possible.
* Every time you use a @SuppressWarnings("unchecked") annotation, add a comment saying why it is safe to do so.
