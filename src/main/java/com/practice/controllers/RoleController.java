package com.practice.controllers;

import com.practice.dto.RoleDto;
import com.practice.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/")
    public ResponseEntity<RoleDto> addRole(@RequestBody RoleDto roleDto) {
        RoleDto role = roleService.addRole(roleDto);
        return new ResponseEntity<>(role, HttpStatus.CREATED);
    }

    @GetMapping("/{roleId}")
    public ResponseEntity<RoleDto> getRoleByRoleId(@PathVariable Integer roleId) {
        RoleDto role = roleService.getRoleByRoleId(roleId);
        return ResponseEntity.ok(role);
    }


}
