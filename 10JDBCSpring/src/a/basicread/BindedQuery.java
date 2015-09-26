package a.basicread;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class BindedQuery {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate((DataSource)context.getBean("dataSource"));
		
		String SQL = "select age from Student where id = ?";
		int age = jdbcTemplateObject.queryForObject(SQL, new Object[]{2}, Integer.class); 
		
		System.out.println("age: " + age);
		
		SQL = "select name from Student where id = ?";
		String name = jdbcTemplateObject.queryForObject(SQL, new Object[]{2}, String.class);
		System.out.println("name: " + name);
	}
	
}
