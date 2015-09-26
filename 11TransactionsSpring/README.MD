# Transaction Management

	* ACID property. Atomicity, consistency, isolation, durability
	* Programatic transaction and declerative transaction support in spring
	* Local transactions are specific to a single transactional resource like a JDBC connection, whereas global transactions can span multiple transactional resources like transaction in a distributed system.

### Programatic Transaction Management
	* Use the instance of TransactionManager to start transaction with beginTransaction().
	* if the db operations are successful, apply a commit(), otherwise rollback()
	* 
	
	The use of proper PlatformTransactionManager implementation is important.

### Declarative Transaction Management
	
	* Declarative transaction management approach allows you to manage the transaction with the help of configuration instead of hard coding in your source code
	* You only use annotations or XML based configuration to manage the transactions.
	* We use <tx:advice /> tag, which creates a transaction-handling advice and same time we define a pointcut that matches all methods we wish to make transactional and reference the transactional advice.
	* If a method name has been included in the transactional configuration then created advice will begin the transaction before calling the method.
	* Target method will be executed in a try / catch block.
	* If the method finishes normally, the AOP advice commits the transaction successfully otherwise it performs a rollback.
	