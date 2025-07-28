package com.practice.services.impl;

import com.practice.dto.RoleDto;
import com.practice.entities.Role;
import com.practice.exceptions.ResourceNotFoundException;
import com.practice.repositories.RoleRepository;
import com.practice.services.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RoleDto addRole(RoleDto roleDto) {
        Role role = modelMapper.map(roleDto, Role.class);
        Role savedRole = roleRepository.save(role);
        return modelMapper.map(savedRole, RoleDto.class);
    }

    @Override
    public RoleDto getRoleByRoleId(Integer roleId) {
        Role role = roleRepository.findById(roleId).orElseThrow(() -> new ResourceNotFoundException("Role", "roleId", String.valueOf(roleId)));
        return modelMapper.map(role, RoleDto.class);
    }
}
