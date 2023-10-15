package org.example.repository;

import org.example.models.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    @Query("from DepartmentEntity s where s.name = :name")
    List<DepartmentEntity> search(@Param("name") String name);

}
