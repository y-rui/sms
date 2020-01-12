package com.lingnan.service.impl;

import com.lingnan.dao.StudentMapper;
import com.lingnan.model.LoginForm;
import com.lingnan.model.Student;
import com.lingnan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务层实现类-操控学生信息
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    // 注入Mapper接口对象
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student login(LoginForm loginForm) {
        return studentMapper.login(loginForm);
    }

    @Override
    public List<Student> selectList(Student student) {
        return studentMapper.selectList(student);
    }

    @Override
    public Student findBySno(Student student) {
        return studentMapper.findBySno(student);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int updatePassword(Student student) {
        return studentMapper.updatePassword(student);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return studentMapper.deleteById(ids);
    }
}
