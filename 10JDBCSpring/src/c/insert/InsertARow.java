package c.insert;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

public class InsertARow {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate((DataSource)context.getBean("dataSource"));
		
		String SQL = "insert into Student (name, age) values (?, ?)";
		int count = jdbcTemplateObject.update( SQL, new Object[]{"Zara", 11} );
		//check the database;
	}
	
	
}
