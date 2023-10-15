package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_EMPLOYEE")
public class EmployeeEntity extends BaseEntity<Long> {

    @Column(name = "E_NAME")
    private String name;

    @Column(name = "E_FAMILY")
    private String family;

    @Column(nullable = false, name = "E_PERSONALCODE", unique = true)
    private String personalCode;

    @Column(name = "e_salary")
    private Double salary;

    @OneToMany(mappedBy = "employeeEntity")
    private List<RoleEntity> roles;

    @ManyToOne
    private DepartmentEntity departmentEntity;

    public EmployeeEntity(Long id) {
        super(id);
    }
}
