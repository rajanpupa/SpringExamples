package c.insert;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateRow {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate((DataSource)context.getBean("dataSource"));
		
		String SQL = "update Student set name = ? where id = ?";
		int count = jdbcTemplateObject.update( SQL, new Object[]{"Zara2", 4} );
		//check the database;
		
		System.out.println("number of rows updated = " + count);
	}
	
	
}
