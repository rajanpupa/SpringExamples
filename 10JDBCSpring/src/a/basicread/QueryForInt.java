package a.basicread;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

public class QueryForInt {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JdbcTemplate template = new JdbcTemplate((DataSource)context.getBean("dataSource"));
		
		String SQL = "select count(*) from Student";
		//int rowCount = template.queryForInt( SQL );//deprecated
		int rowCount = template.queryForObject(SQL, new Object[]{}, Integer.class);
		System.out.println("rowcount: " + rowCount);
	}
	
	
}
