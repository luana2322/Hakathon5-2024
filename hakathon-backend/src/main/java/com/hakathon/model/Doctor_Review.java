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
@Table(name="doctor_review")

public class Doctor_Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doctor_review_id")
    private Long doctor_review_id;
    private String comment;
    private double rating;
    private int num_comment;
    private Date created_At;
    private Date updated_At;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id",referencedColumnName = "doctor_id")
    private Doctor doctor;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="patient_id",referencedColumnName = "patient_id")
    private Patient patient;
}
