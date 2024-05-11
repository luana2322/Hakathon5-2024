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
@Table(name="medicalhistory_nurse")

public class MedicalHistory_Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medicalhistory_nurse_id")
    private Long medicalhistory_nurse_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medial_history_id",referencedColumnName = "medial_history_id")
    private Medical_History medical_history;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nurse_id",referencedColumnName = "nurse_id")
    private Nurse nurse;

}
