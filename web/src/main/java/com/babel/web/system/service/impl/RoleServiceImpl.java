package com.babel.web.system.service.impl;

import com.babel.web.system.dao.RoleDao;
import com.babel.web.system.entity.Role;
import com.babel.web.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by allen on 2017/5/31.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getRoles() {
        return roleDao.queryAll();
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public void delete(String role) {
        roleDao.delete(role);
    }

    @Override
    public void update(String oldRoleName,String roleName,String roleDescription) {
        roleDao.update(oldRoleName,roleName,roleDescription);
    }
}
