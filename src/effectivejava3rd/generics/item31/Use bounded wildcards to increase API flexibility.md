* For maximum flexibility, use wildcard types on input parameters that represent producers or consumers. 
* PECS stands for producer-extends, consumer-super.
* Do not use bounded wildcard types as return types.
* If the user of a class has to think about wildcard types, there is probably something wrong with its API.
* if a type parameter appears only once in a method declaration, replace it with a wildcard.
