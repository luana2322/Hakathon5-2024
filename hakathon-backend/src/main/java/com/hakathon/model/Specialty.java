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
@Table(name="specialty")
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="specialty_id")
    private Long specialty_id;
    private String specialty_name;
    private String description;
    private Date created_At;
    private Date updated_At;


    @OneToMany(mappedBy = "specialty")
    private List<Doctor> doctorList;


    @OneToMany(mappedBy = "specialty")
    private List<Nurse> nurseList;
}
