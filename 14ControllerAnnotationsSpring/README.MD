# Controller annotations examples

	* @Controller
	* @RequestMapping(value={"/path1", "/path2" }, Method=RequestMethod.PUT)
	* @RequestParam : in the method argument
	
	The Model object is used to pass messages and objects to the view, from the controller.
	If we declare a type of Model in the controller's method parameter, spring automatically injects the model object.