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
@Table(name="city")

public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_id")
    private Long city_id;
    private String city_name;

    @OneToMany(mappedBy = "city")
    private List<Patient> patientList;

    @OneToMany(mappedBy = "city")
    private List<Doctor> doctorList;


    @OneToMany(mappedBy = "city")
    private List<Nurse> nurseList;


    @OneToMany(mappedBy = "city")
    private List<Hospital> hospitalList;




}
