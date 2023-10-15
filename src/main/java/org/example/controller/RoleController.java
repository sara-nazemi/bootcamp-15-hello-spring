package org.example.controller;

import org.example.models.DepartmentEntity;
import org.example.models.RoleEntity;
import org.example.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/spring/app/role")
    public Response<List<RoleEntity>> getAll() {
        return new Response<>("successful result", roleService.getAll());
    }

    @PostMapping("/spring/app/role/save")
    public Response<Boolean> save(@RequestBody RoleEntity person) {
        return new Response<>("successful save result", roleService.save(person));
    }

    @DeleteMapping("/spring/app/role/{id}")
    public Response<Boolean> deleteById(@PathVariable Long id) {
        return new Response<>("successful delete result", roleService.deleteById(id));
    }

    @GetMapping("/spring/app/role/{id}")
    public Response<RoleEntity> loadById(@PathVariable Long id) {
        return new Response<>("successful load result", roleService.loadById(id));
    }

    @GetMapping("/spring/app/role/search")
    public Response<List<RoleEntity>> search(@RequestParam("name") String name) {
        return new Response<>("successful search result", roleService.search(name));

    }
}
