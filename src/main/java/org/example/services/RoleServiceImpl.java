package org.example.services;

import org.example.models.RoleEntity;
import org.example.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleEntity> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Boolean save(RoleEntity roleEntity) {
        roleRepository.save(roleEntity);
        return Boolean.TRUE;
    }

    @Override
    public Boolean deleteById(Long id) {
        roleRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public RoleEntity loadById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public List<RoleEntity> search(String name) {
        return roleRepository.search(name);
    }
}
