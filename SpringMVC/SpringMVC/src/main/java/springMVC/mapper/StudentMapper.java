package springMVC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import springMVC.model.Student;

/**
 * @author ThuHien
 */
public class StudentMapper implements RowMapper<Student> {

	public static final String BASE_SQL = "Select s.ID, s.NAME, s.BIRTHDAY, s.CLASSNAME " + " from students s";

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Integer id = rs.getInt("ID");
		String name = rs.getString("NAME");
		Date birthday = rs.getDate("BIRTHDAY");
		String className = rs.getString("CLASSNAME");

		return new Student(id, name, birthday, className);
	}

}