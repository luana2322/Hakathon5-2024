package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="doctor_degree")

public class Doctor_Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doctor_degree_id")
    private Long doctor_degree_id;
    private Date completion_year;
    private String additional_info;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "degree_id",referencedColumnName = "degree_id")
    private Degree degree;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id",referencedColumnName = "doctor_id")
    private Doctor doctor;

}
