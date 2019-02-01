* Do not accept the default serialized form without first considering whether it is appropriate. 
* The default serialized form is likely to be appropriate if an object’s physical representation is identical to its logical content. 
* Even if you decide that the default serialized form is appropriate, you often must provide a readObject method to ensure invariants and security.

## Using the default serialized form when an object’s physical representation differs substantially from its logical data content has four disadvantages:

* It permanently ties the exported API to the current internal representation.
* It can consume excessive space.
* It can consume excessive time.
* It can cause stack overflows. 

* Before deciding to make a field nontransient, convince yourself that its value is part of the logical state of the object.
* You must impose any synchronization on object serialization that you would impose on any other method that reads the entire state of the object.
* Regardless of what serialized form you choose, declare an explicit serial version UID in every serializable class you write. 
* Do not change the serial version UID unless you want to break compatibility with all existing serialized instances of a class.
