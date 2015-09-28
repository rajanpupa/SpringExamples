# MVC

	* DispatcherServlet: handles all the HTTP requests and responses
	* HandlerMapping: After receiving an HTTP request, DispatcherServlet consults the HandlerMapping to call the appropriate Controller.
	* Controller: The Controller takes the request and calls the appropriate service methods based on used GET or POST method. The service method will set model data based on defined business logic and returns view name to the DispatcherServlet.
	* ViewResolver: The DispatcherServlet will take help from ViewResolver to pickup the defined view for the request.
	* View: The DispatcherServlet passes the model data to the view which is finally rendered on the browser.
	
## Configuration
	
	* map requests that you want the DispatcherServlet to handle, by using a URL mapping in the web.xml
	* [servlet-name]-servlet.xml file for servlet configuration, whose default location is WEB-INF directory
	* can customize this file name and location by adding the servlet listener ContextLoaderListener in your web.xml	

## servlet configuration
	* <context:component-scan...> will activate the basic annotation scanning capability and define the package to scan
	* <mvc:annotation-driven/> will activate the mvc annotations like @RequestMapping ...
	
### Basic annotations
	
	* @Controller
	* @Service
	* @Repository
	* @Component