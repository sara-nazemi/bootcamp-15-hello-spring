package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "t_department")
public class DepartmentEntity extends BaseEntity<Long> {

    @Column(name = "c_name")
    private String name;

    @OneToMany(mappedBy = "departmentEntity")
    private List<EmployeeEntity> employees;

    @Version
    private Integer version;

    public DepartmentEntity(Long id) {
        super(id);
    }


}
