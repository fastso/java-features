* Singletons typically represent either a stateless object such as a function (Item 24) or a system component that is intrinsically unique. 

# Singleton with public final field
* A privileged client can invoke the private constructor reflectively with the aid of the AccessibleObject.setAccessible method.

# Singleton with static factory
* the API makes it clear that the class is a singleton.
* it gives you the flexibility to change your mind about whether the class is a singleton without changing its API.

# Enum singleton
* A single-element enum type is often the best way to implement a singleton.
* You can’t use this approach if your singleton must extend a superclass other than Enum (though you can declare an enum to implement interfaces).