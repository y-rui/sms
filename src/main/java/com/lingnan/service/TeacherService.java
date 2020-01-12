package com.lingnan.service;

import com.lingnan.model.LoginForm;
import com.lingnan.model.Teacher;

import java.util.List;

/**
 * 业务层-操控教师信息
 */
public interface TeacherService {

    // 验证登录信息是否正确
    Teacher login(LoginForm loginForm);

    // 根据教师与班级名查询指定/全部教师信息列表
    List<Teacher> selectList(Teacher teacher);

    // 根据工号查询指定教师信息
    Teacher findByTno(Teacher teacher);

    // 添加教师信息
    int insert(Teacher teacher);

    // 根据id修改指定教师信息
    int update(Teacher teacher);

    // 根据id修改指定教师密码
    int updatePassword(Teacher teacher);

    // 根据id删除指定教师信息
    int deleteById(Integer[] ids);
}
