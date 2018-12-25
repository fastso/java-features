* You must program defensively, with the assumption that clients of your class will do their best to destroy its invariants.
* Date is obsolete and should no longer be used in new code.
* It is essential to make a defensive copy of each mutable parameter to the constructor.
* Defensive copies are made before checking the validity of the parameters, and the validity check is performed on the copies rather than on the originals.
* Do not use the clone method to make a defensive copy of a parameter whose type is subclassable by untrusted parties.
* Modify the accessors to return defensive copies of mutable internal fields.
