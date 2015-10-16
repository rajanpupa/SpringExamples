# Inteceptors

 * Inteceptors could be added to spring lifecycle.
 * Provides three methods: preHandle(), postHandle(), afterExecution()
 * preHandle is executed before the controller method
 * postHandle is executed after the controller method
 * afterExecution is executed before the viewModel is sent to the view to render
 
 * Extend the HandlerInteceptorAdaptor class which is an instance of HandlerInterceptor
 * override the methods above.
 
 ### Use cases
  * to add some generic messaege to the model
  * to change the route of controller, eg. redirect to some other page before returning false from preHandle()
  