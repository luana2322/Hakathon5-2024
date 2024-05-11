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
@Table(name="medicalsnapshot_nurse")

public class MedicalSnapshot_Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medicalhistory_nurse_id")
    private Long medicalhistory_nurse_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medical_snapshot_id",referencedColumnName = "medical_snapshot_id")
    private Medical_Snapshot medical_snapshot;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nurse_id",referencedColumnName = "nurse_id")
    private Nurse nurse;
}
