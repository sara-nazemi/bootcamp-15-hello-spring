package org.example.services;

import org.example.models.EmployeeEntity;
import org.example.repository.EmploeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmploeeRepository emploeeRepository;

    @Override
    public List<EmployeeEntity> getAll() {
        return emploeeRepository.findAll();
    }

    @Override
    public Boolean save(EmployeeEntity employeeEntity) {
        emploeeRepository.save(employeeEntity);
        return Boolean.TRUE;
    }

    @Override
    public Boolean deleteById(Long id) {
        emploeeRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public EmployeeEntity loadById(Long id) {
        return emploeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeEntity> search(String name) {
        return emploeeRepository.search(name);
    }
}
