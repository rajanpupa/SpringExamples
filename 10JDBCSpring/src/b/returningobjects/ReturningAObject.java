package b.returningobjects;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ReturningAObject {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(
				(DataSource) context.getBean("dataSource"));

		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { 2 }, new StudentMapper());
		
		System.out.println("The student returned : " + student);
	}

}
