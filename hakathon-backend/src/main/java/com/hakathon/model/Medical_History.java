package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="medical_history")

public class Medical_History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medial_history_id")
    private Long medial_history_id;

    private Date addmission_date;
    private Date discharge_date;
    private String chief_complaint;
    private String test_result;
    private String final_result;
    private String note;

    @OneToMany(mappedBy = "medical_history")
    private List<MedicalHistory_Medication> medicalHistoryMedicationList ;

    @OneToMany(mappedBy = "medical_history")
    private List<MedicalHistory_Doctor> medicalHistoryDoctorList;

    @OneToMany(mappedBy = "medical_history")
    private List<MedicalHistory_Nurse> medicalHistoryNurseList;
}
