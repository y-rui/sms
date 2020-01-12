package com.lingnan.service.impl;

import com.lingnan.dao.GradeMapper;
import com.lingnan.model.Grade;
import com.lingnan.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务层实现类-操控年级信息
 */
@Service
@Transactional
public class GradeServiceImpl implements GradeService {

    // 注入Mapper接口对象
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> selectList(Grade name) {
        return gradeMapper.selectList(name);
    }

    @Override
    public List<Grade> selectAll() {
        return gradeMapper.selectAll();
    }

    @Override
    public Grade findByName(String name) {
        return gradeMapper.findByName(name);
    }

    @Override
    public int insert(Grade grade) {
        return gradeMapper.insert(grade);
    }

    @Override
    public int update(Grade grade) {
        return gradeMapper.update(grade);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return gradeMapper.deleteById(ids);
    }
}
