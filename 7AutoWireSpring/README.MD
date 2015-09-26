# AutoWire

### Types of Autowire

	* no             - default, no autowiring
	* byName 
	* byType
	* constructor
	* autodetect 	- first by constructor, then by type
	
### Limitations of autowiring
	
	* You can still specify dependencies using <constructor-arg> and <property> settings which will always override autowiring.
	* You cannot autowire so-called simple properties such as primitives, Strings, and Classes.
	* Autowiring is less exact than explicit wiring, so if possible prefer using explict wiring.
	
# Annotation Based Configuration

	* Annotation injection is performed before XML injection, thus the latter configuration will override the former for properties wired through both approaches.
	* To turn on the annotation config use: <context:annotation-config/>
	
	## Annotations
		
		* @Required
		* @Autowired
		* @Qualifier : used with @Autowired to specify the exact bean name.
		* @Resource
		* @PostConstruct
		* @PreDestroy
		* @Configuration and @Bean : can use AnnotationConfigApplicationContext class to load this configuration file.