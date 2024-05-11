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
@Table(name="medical_snapshot")

public class Medical_Snapshot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medical_snapshot_id")
    private Long labtype_labanalysis_id;


    private Date addmission_date;
    private Date discharge_date;
    private String chief_complaint;
    private String test_result;
    private String final_result;
    private String note;
    private String description;

    private Date created_At;
    private Date deleted_At;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medialrecord_id",referencedColumnName = "medialrecord_id")
    private Medial_Record medial_record;

    @OneToMany(mappedBy = "medical_snapshot")
    private List<MedicalSnapshot_Doctor> medicalSnapshotDoctorList;

    @OneToMany(mappedBy = "medical_snapshot")
    private List<MedicalSnapshot_Medication> medicalSnapshotMedications ;

    @OneToMany(mappedBy = "medical_snapshot")
    private List<MedicalSnapshot_Nurse> medicalSnapshotNurses ;

    @OneToMany(mappedBy = "medical_snapshot")
    private List<Lab_Analysis> labAnalysisList;

}
