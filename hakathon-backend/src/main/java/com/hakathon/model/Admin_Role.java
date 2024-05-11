package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="admin_role")

public class Admin_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="admin_role_id")
    private Long admin_role_id;

    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn(name="admin_id",referencedColumnName = "admin_id")
    private Admin admin;

    @ManyToOne(fetch =FetchType.EAGER )
    @JoinColumn(name="role_id",referencedColumnName = "role_id")
    private Role role;
}
