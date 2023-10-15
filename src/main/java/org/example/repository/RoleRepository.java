package org.example.repository;

import org.example.models.EmployeeEntity;
import org.example.models.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    @Query("from RoleEntity s where s.name = :name")
    List<RoleEntity> search(@Param("name") String name);
}
