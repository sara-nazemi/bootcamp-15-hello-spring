package org.example.services;

import org.example.models.DepartmentEntity;
import org.example.models.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll();

    Boolean save(EmployeeEntity employeeEntity);

    Boolean deleteById(Long id);

    EmployeeEntity loadById(Long id);

    List<EmployeeEntity> search(String name);
}
