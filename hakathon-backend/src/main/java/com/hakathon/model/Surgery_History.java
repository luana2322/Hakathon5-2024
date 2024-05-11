package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="surgery_history")

public class Surgery_History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="surgery_history_id")
    private Long surgery_history_id;

    private String surgery_name;
    private String description;
    private String anesthesia_type;
    private double cost;
    private LocalTime time_start;
    private LocalTime time_end;
    private LocalDate day_start;
    private LocalDate day_end;
    private String preoperative_note;
    private String postoperative_note;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medialrecord_id",referencedColumnName = "medialrecord_id")
    private Medial_Record medial_record;


    @OneToMany(mappedBy = "surgery_history")
    private List<SurgeryHistory_Doctor> surgeryHistoryDoctorList;

    @OneToMany(mappedBy = "surgery_history")
    private List<SurgeryHistory_Medication> surgeryHistoryMedicationList;

    @OneToMany(mappedBy = "surgery_history")
    private List<SurgeryHistory_Nurse> surgeryHistoryNurseList;

}
