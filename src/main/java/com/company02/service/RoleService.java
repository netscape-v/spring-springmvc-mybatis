package com.company02.service;

import com.company02.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    Integer addRole(Role role);
}
