package springMVC.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMVC.mapper.StudentMapper;
import springMVC.model.Student;

/**
 * @author ThuHien
 */
@Repository
@Transactional
public class StudentDAOImpl extends JdbcDaoSupport implements StudentDAO {

	@Autowired
	public StudentDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	@Override
	public List<Student> listStudent() {
		String sql = StudentMapper.BASE_SQL;

		Object[] params = new Object[] {};
		StudentMapper mapper = new StudentMapper();

		List<Student> list = this.getJdbcTemplate().query(sql, params, mapper);
		return list;
	}

}