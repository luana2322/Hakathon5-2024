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
@Table(name="medicalsnapshot_doctor")
public class MedicalSnapshot_Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medicalsnapshot_doctor_id")
    private Long medicalsnapshot_doctor_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medical_snapshot_id",referencedColumnName = "medical_snapshot_id")
    private Medical_Snapshot medical_snapshot;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id",referencedColumnName = "doctor_id")
    private Doctor doctor;

}
