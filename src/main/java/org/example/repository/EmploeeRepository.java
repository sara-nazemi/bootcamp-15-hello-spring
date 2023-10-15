package org.example.repository;

import org.example.models.DepartmentEntity;
import org.example.models.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploeeRepository extends JpaRepository<EmployeeEntity,Long> {
    @Query("from EmployeeEntity s where s.name = :name")
    List<EmployeeEntity> search(@Param("name") String name);
}
