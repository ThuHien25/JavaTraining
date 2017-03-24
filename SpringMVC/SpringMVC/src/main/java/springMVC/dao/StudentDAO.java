package springMVC.dao;

import java.util.List;

import springMVC.model.Student;

/**
 * Defines DAO operations for the student model.
 * 
 * @author ThuHien
 *
 */
public interface StudentDAO {

	public List<Student> listStudent();
	
}
