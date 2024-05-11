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
@Table(name="medicalhistory_doctor")

public class MedicalHistory_Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medicalhistory_doctor_id")
    private Long medicalhistory_doctor_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id",referencedColumnName = "doctor_id")
    private Doctor doctor;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medial_history_id",referencedColumnName = "medial_history_id")
    private Medical_History medical_history;

}
