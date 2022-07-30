package cn.lmx.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.lmx.student.model.Student;

@Mapper
public interface StudentDao {

    /**
     * 插入一行数据
     * @param file
     * @return
     */
    int save(Student student);

    /**
     * 删除一行数据
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 更新一行数据
     * @param file
     * @return
     */
    int update(Student student);
    /**
     * 通过主键获取一行数据
     * @return
     */
    Student selectById(int id);

    /**
     * 获取所有数据
     * @param file
     * @return
     */
    List<Student> findAll();

}
