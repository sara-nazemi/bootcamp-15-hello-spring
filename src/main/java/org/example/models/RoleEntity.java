package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_role")
public class RoleEntity extends BaseEntity<Long> {

    @Column(name = "r_name")
    private String name;

    @Column(name = "r_code", nullable = false, unique = true)
    private String code;

    @ManyToOne
    private EmployeeEntity employeeEntity;

    public RoleEntity(Long id, String name) {
        super(id);
        this.name = name;
    }
}
