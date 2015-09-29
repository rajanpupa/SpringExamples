# State Management

	* Request Scope: Thread safe
	* Session Scope: Sessions are a critical state management service provided by the web container
	* Context Scope: Lifetime is “usually” defined by deployment of application. Applicaiton level scope
	
Request scope: short term computed results to pass from one servlet to another (i.e., “forward”)
```doGet(HttpServletRequest request, HttpServletResponse response)
   request.getAtttribute(String name) [or setAttribute]
   model.getAttribute```

Session scope: conversational state info across a series of sequential requests from a particular user
```HttpSession session = request.getSession().getAttribute(String name)
   @SessionAttributes```

Application/context scope: global info available to all controllers in this application
```request.getServletContext(). getAttribute(String name)

XML configuration OR @Autowired ServletContext servletContext;

* @SessionAttributes("attributeName") Class level annotation that indicates an object is to be added/retrieved from Session
* now put any message in model with same key, it will be available in session.
* use (SessionStatus) .setComplete to remove the session variables.