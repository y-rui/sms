package com.lingnan.service.impl;

import com.lingnan.dao.AdminMapper;
import com.lingnan.model.Admin;
import com.lingnan.model.LoginForm;
import com.lingnan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务层实现类-操控管理员信息
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    // 注入Mapper接口对象
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(LoginForm loginForm) {
        return adminMapper.login(loginForm);
    }

    @Override
    public Admin findByName(String name) {
        return adminMapper.findByName(name);
    }

    @Override
    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }

    @Override
    public List<Admin> selectList(Admin admin) {
        return adminMapper.selectList(admin);
    }

    @Override
    public int update(Admin admin) {
        return adminMapper.update(admin);
    }

    @Override
    public int updatePassword(Admin admin) {
        return adminMapper.updatePassword(admin);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return adminMapper.deleteById(ids);
    }
}
