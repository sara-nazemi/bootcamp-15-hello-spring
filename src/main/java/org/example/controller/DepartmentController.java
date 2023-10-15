package org.example.controller;

import org.example.models.DepartmentEntity;
import org.example.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/spring/app/department")
    public Response<List<DepartmentEntity>> getAll() {
        return new Response<>("successful result", departmentService.getAll());
    }

    @PostMapping("/spring/app/department/save")
    public Response<Boolean> save(@RequestBody DepartmentEntity person) {
        return new Response<>("successful save result", departmentService.save(person));
    }

    @DeleteMapping("/spring/app/department/{id}")
    public Response<Boolean> deleteById(@PathVariable Long id) {
        return new Response<>("successful delete result", departmentService.deleteById(id));
    }

    @GetMapping("/spring/app/department/{id}")
    public Response<DepartmentEntity> loadById(@PathVariable Long id) {
        return new Response<>("successful load result", departmentService.loadById(id));
    }

    @GetMapping("/spring/app/department/search")
    public Response<List<DepartmentEntity>> search(@RequestParam("name") String name) {
        return new Response<>("successful search result", departmentService.search(name));

    }
}
