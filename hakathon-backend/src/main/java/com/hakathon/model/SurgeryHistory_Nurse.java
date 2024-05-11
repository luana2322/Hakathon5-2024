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
@Table(name="surgeryhistory_nurse")

public class SurgeryHistory_Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="surgeryhistory_nurse_id")
    private Long surgeryhistory_nurse_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nurse_id",referencedColumnName = "nurse_id")
    private Nurse nurse;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "surgery_history_id",referencedColumnName = "surgery_history_id")
    private Surgery_History surgery_history;

}
