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
@Table(name="patient_role")

public class Patient_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="patient_role_id")
    private Long patient_role_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id",referencedColumnName = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="role_id",referencedColumnName = "role_id")
    private Role role;

}
