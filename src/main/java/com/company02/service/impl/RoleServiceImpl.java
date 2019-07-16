package com.company02.service.impl;

import com.company02.dao.Mapper;
import com.company02.entity.Role;
import com.company02.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private Mapper mapper;
    public List<Role> findAll() {
        return mapper.findAll();
    }

    @Override
    public Integer addRole(Role role) {
        return mapper.addRole(role);
    }
}
