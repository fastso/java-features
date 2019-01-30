* Under most circumstances, normal initialization is preferable to lazy initialization. 
* If you use lazy initialization to break an initialization circularity, use a synchronized accessor.
* If you need to use lazy initialization for performance on a static field, use the lazy initialization holder class idiom. 
* If you need to use lazy initialization for performance on an instance field, use the double-check idiom. 
