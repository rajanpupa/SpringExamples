# BeanDefinitionInheritence
	
	* A bean definition can contain a lot of configuration information, including constructor arguments, property values, and container-specific information such as initialization method, static factory method name, and so on.
	* A child bean definition inherits configuration data from a parent definition. The child definition can override some values, or add others, as needed.
	* Spring Bean definition inheritance has nothing to do with Java class inheritance but inheritance concept is same. You can define a parent bean definition as a template and other child beans can inherit required configuration from the parent bean.
	
	* use the parent="parentBean" attribute in the bean definition
	
	### can use a bean template
	
	```
	<bean id="beanTeamplate" abstract="true">
      <property name="message1" value="Hello World!"/>
      <property name="message2" value="Hello Second World!"/>
      <property name="message3" value="Namaste India!"/>
   </bean>
   ```