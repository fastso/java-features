* Make each class or member as inaccessible as possible. 
* Instance fields of public classes should rarely be public.
* Classes with public mutable fields are not generally thread-safe.
* it is wrong for a class to have a public static final array field, or an accessor that returns such a field.