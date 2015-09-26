# Aspect Oriented Programming

### Terminologies
	
	* Aspect : A module with set of APIs, providing cross cutting requirement
	* Join Point: This represents a point in your application where you can plug-in AOP aspect.
	* Advice : This is the actual action to be taken either before or after the method execution. This is actual piece of code that is invoked during program execution by Spring AOP framework.
	* Pointcut : This is a set of one or more joinpoints where an advice should be executed. You can specify pointcuts using expressions or patterns
	* Introduction : An introduction allows you to add new methods or attributes to existing classes.
	* Target obj: The object being advised by one or more aspects
	* Weaving : Weaving is the process of linking aspects with other application types or objects to create an advised object. This can be done at compile time, load time, or at runtime.
	
### Types of Advice
	
	* before : Run advice before the a method execution.
	* after : Run advice after the a method execution regardless of its outcome.
	* after-returning : 
	* after-throwing  :
	* around : 