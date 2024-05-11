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
@Table(name="medicalsnapshot_medication")

public class MedicalSnapshot_Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medicalsnapshot_medication_id")
    private Long medicalsnapshot_medication_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medical_snapshot_id",referencedColumnName = "medical_snapshot_id")
    private Medical_Snapshot medical_snapshot;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medication_id",referencedColumnName = "medication_id")
    private Medication medication;
}
