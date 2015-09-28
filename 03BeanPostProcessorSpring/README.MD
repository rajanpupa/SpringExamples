# BeanPostProcessor
	
	* The BeanPostProcessor interface defines callback methods that you can implement 
	to provide your own instantiation logic, dependency-resolution logic etc. 
	You can also implement some custom logic after the Spring container finishes 
	instantiating, configuring, and initializing a bean by plugging in one or more 
	BeanPostProcessor implementations.
	* Spring IoC container instantiates a bean instance and then BeanPostProcessor interfaces do their work.
	
	* registerShutdownHook() method on the AbstractApplicationContext will gracefully shutdown and call the relevant destroy methods.
	