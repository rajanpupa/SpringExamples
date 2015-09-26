## EventHandeling

* Event handling in the ApplicationContext is provided through the ApplicationEvent class and ApplicationListener interface

## Shared Events

	* ContextRefreshedEvent : This event is published when the ApplicationContext is either initialized or refreshed. This can also be raised using the refresh() method on the ConfigurableApplicationContext interface.
	* ContextStartedEvent   : This event is published when the ApplicationContext is started using the start() method on the ConfigurableApplicationContext interface. You can poll your database or you can re/start any stopped application after receiving this event.
	* ContextStoppedEvent   : This event is published when the ApplicationContext is stopped using the stop() method on the ConfigurableApplicationContext interface. You can do required housekeep work after receiving this event.
	* ContextClosedEvent    : This event is published when the ApplicationContext is closed using the close() method on the ConfigurableApplicationContext interface. A closed context reaches its end of life; it cannot be refreshed or restarted.
	* RequestHandledEvent   : This is a web-specific event telling all beans that an HTTP request has been serviced.
	