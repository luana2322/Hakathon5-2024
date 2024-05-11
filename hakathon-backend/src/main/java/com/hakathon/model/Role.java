package com.hakathon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long role_id;
    private String role_name;
    private String description;
    private Date created_At;
    private Date updated_At;


    @OneToMany(mappedBy = "role")
    private List<Admin_Role> list_admin_role;

    @OneToMany(mappedBy = "role")
    private List<Patient_Role> list_patient_role;

    @OneToMany(mappedBy = "role")
    private List<Doctor_Role> doctorRoleList;


    @PrePersist
    protected void onCreate() {
        this.created_At=new Date(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_At=new Date(System.currentTimeMillis());
    }
}
