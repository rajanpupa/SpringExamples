package b.returningobjects;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ReturningMultipleObjects {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(
				(DataSource) context.getBean("dataSource"));

		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL,new StudentMapper());
		
		for(Student student : students){
			System.out.println("The student returned : " + student);
		}
	}

}
