package org.example.services;

import org.example.models.EmployeeEntity;
import org.example.models.RoleEntity;

import java.util.List;

public interface RoleService {

    List<RoleEntity> getAll();

    Boolean save(RoleEntity roleEntity);

    Boolean deleteById(Long id);

    RoleEntity loadById(Long id);

    List<RoleEntity> search(String name);
}
