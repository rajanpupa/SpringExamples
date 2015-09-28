# Initialization Callbacks
	
	* Either implement the InitializingBean interface and override the afterPropertiesSet() method
	* Or use the init-method attribute in the xml based bean.
	
	<bean id="exampleBean" 
         class="examples.ExampleBean" init-method="init"/>
	
# Destruction Call backs

	* DisposableBean interface and destroy method
	* destroy-method attribute in the xml
	
	<bean id="exampleBean"
         class="examples.ExampleBean" destroy-method="destroy"/>