package org.example.services;

import org.example.models.DepartmentEntity;
import org.example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<DepartmentEntity> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Boolean save(DepartmentEntity departmentEntity) {
         departmentRepository.save(departmentEntity);
        return Boolean.TRUE;
    }

    @Override
    public Boolean deleteById(Long id) {
        departmentRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public DepartmentEntity loadById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<DepartmentEntity> search(String name) {
        return departmentRepository.search(name);
    }
}
