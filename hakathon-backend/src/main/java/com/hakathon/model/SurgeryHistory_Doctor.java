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
@Table(name="surgeryhistory_doctor")
public class SurgeryHistory_Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="surgeryhistory_doctor_id")
    private Long surgeryhistory_doctor_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id",referencedColumnName = "doctor_id")
    private Doctor doctor;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "surgery_history_id",referencedColumnName = "surgery_history_id")
    private Surgery_History surgery_history;

}
