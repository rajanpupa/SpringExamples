package c.insert;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteARow {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate((DataSource)context.getBean("dataSource"));
		
		String SQL = "delete from Student where id = ?";
		int count = jdbcTemplateObject.update( SQL, new Object[]{4} );
		//check the database;
	}
	
	
}
