package cn.lmx.student.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lmx.student.dao.StudentDao;
import cn.lmx.student.model.Student;

/**
 * 文件上传服务
 */
@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	/**
	 * 增加学生
	 */
	public void save(Student student) throws IOException {

		studentDao.save(student);
	}

	/**
	 * 删除学生
	 */
	public void deleteStudent(Integer id) throws IOException {

		studentDao.deleteById(id);
	}

	/**
	 * 更新学生信息
	 */
	public void updateStudent(Student student) throws IOException {

		studentDao.update(student);
	}

	/**
	 * 查询一个学生信息
	 */
	public Student getOneStudent(Integer id) throws IOException {

		return studentDao.selectById(id);
	}
	
	/**
	 * 查询所有学生
	 */
	public List<Student> findAllStudent() throws IOException {

		return studentDao.findAll();
	}

}
