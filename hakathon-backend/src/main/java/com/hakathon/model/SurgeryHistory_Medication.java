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
@Table(name="surgeryhistory_medication")

public class SurgeryHistory_Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="surgeryhistory_medication_id")
    private Long surgeryhistory_medication_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medication_id",referencedColumnName = "medication_id")
    private Medication medication;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "surgery_history_id",referencedColumnName = "surgery_history_id")
    private Surgery_History surgery_history;

}
