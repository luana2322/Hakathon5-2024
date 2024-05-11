package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private Long department_id;
    private String department_name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hospital_id",referencedColumnName = "hospital_id")
    private Hospital hospital;


    @OneToMany(mappedBy = "department")
    private List<Doctor> doctorList;


    @OneToMany(mappedBy = "department")
    private List<Nurse> nurseList;
}
