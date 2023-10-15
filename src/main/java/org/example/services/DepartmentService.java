package org.example.services;

import org.example.models.DepartmentEntity;

import java.util.List;

public interface DepartmentService {
    List<DepartmentEntity> getAll();

    Boolean save(DepartmentEntity departmentEntity);

    Boolean deleteById(Long id);

    DepartmentEntity loadById(Long id);

    List<DepartmentEntity> search(String name);
}
