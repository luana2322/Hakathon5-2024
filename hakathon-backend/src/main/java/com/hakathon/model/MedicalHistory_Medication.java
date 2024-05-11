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
@Table(name="medicalhistory_medication")

public class MedicalHistory_Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medicalhistory_medication_id")
    private Long medicalhistory_medication_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medial_history_id",referencedColumnName = "medial_history_id")
    private Medical_History medical_history;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medication_id",referencedColumnName = "medication_id")
    private Medication medication;

}
