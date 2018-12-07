* If you use raw types, you lose all the safety and expressiveness benefits of generics.
* You lose type safety if you use a raw type such as List, but not if you use a parameterized type such as List<Object>.
* If you want to use a generic type but you don’t know or care what the actual type parameter is, you can use a question mark instead.
* You can’t put any element (other than null) into a Collection<?>. 
* You must use raw types in class literals.
