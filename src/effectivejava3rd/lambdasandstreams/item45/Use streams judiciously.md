* Overusing streams makes programs hard to read and maintain.
* In the absence of explicit types, careful naming of lambda parameters is essential to the readability of stream pipelines.
* Using helper methods is even more important for readability in stream pipelines than in iterative code.
* Refrain from using streams to process char values.
* Refactor existing code to use streams and use them in new code only where it makes sense to do so.
* If you’re not sure whether a task is better served by streams or iteration, try both and see which works better.
