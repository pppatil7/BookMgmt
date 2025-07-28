package com.practice.services;

import com.practice.dto.RoleDto;

public interface RoleService {

    RoleDto addRole(RoleDto roleDto);

    RoleDto getRoleByRoleId(Integer roleId);
}
