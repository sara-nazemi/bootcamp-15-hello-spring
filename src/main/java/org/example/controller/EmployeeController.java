package org.example.controller;

import org.example.models.DepartmentEntity;
import org.example.models.EmployeeEntity;
import org.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/spring/app/employee")
    public Response<List<EmployeeEntity>> getAll() {
        return new Response<>("successful result", employeeService.getAll());
    }

    @PostMapping("/spring/app/employee/save")
    public Response<Boolean> save(@RequestBody EmployeeEntity person) {
        return new Response<>("successful save result", employeeService.save(person));
    }

    @DeleteMapping("/spring/app/employee/{id}")
    public Response<Boolean> deleteById(@PathVariable Long id) {
        return new Response<>("successful delete result", employeeService.deleteById(id));
    }

    @GetMapping("/spring/app/employee/{id}")
    public Response<EmployeeEntity> loadById(@PathVariable Long id) {
        return new Response<>("successful load result", employeeService.loadById(id));
    }

    @GetMapping("/spring/app/employee/search")
    public Response<List<EmployeeEntity>> search(@RequestParam("name") String name) {
        return new Response<>("successful search result", employeeService.search(name));

    }
}
