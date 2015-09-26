package ddl;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

public class ExecuteDDL {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate((DataSource)context.getBean("dataSource"));
		
		String SQL = "CREATE TABLE Student2( " +
				   "ID   INT NOT NULL AUTO_INCREMENT, " +
				   "NAME VARCHAR(20) NOT NULL, " +
				   "AGE  INT NOT NULL, " +
				   "PRIMARY KEY (ID))";

				jdbcTemplateObject.execute( SQL );
		
		
	}
	
	
}
