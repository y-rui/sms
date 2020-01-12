package com.lingnan.service;

import com.lingnan.model.Grade;

import java.util.List;

/**
 * 业务层-操控年级信息
 */
public interface GradeService {

    // 根据班级名称获取指定/全部班级信息列表
    List<Grade> selectList(Grade name);

    // 查询所有年级信息列表(用于在班级管理页面中获取年级信息)
    List<Grade> selectAll();

    // 根据年级名称查询指定的年级信息
    Grade findByName(String name);

    // 添加年级信息
    int insert(Grade grade);

    // 根据id修改指定年级信息
    int update(Grade grade);

    // 根据id删除指定年级信息
    int deleteById(Integer[] ids);
}
