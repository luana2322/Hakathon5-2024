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
@Table(name="medication")

public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medication_id")
    private Long medication_id;
    private String medication_name;
    private String dosare_form;
    private String route_of_administration;
    private String indications;
    private String contrandication;
    private String side_effects;
    private String medication_effects;
    private String user_group;
    private Date created_At;
    private Date deleted_At;

    @OneToMany(mappedBy = "medication")
    private List<MedicalSnapshot_Medication> medicalSnapshotMedicationList;

    @OneToMany(mappedBy = "medication")
    private List<MedicalHistory_Medication> medicalHistoryMedicationList;

    @OneToMany(mappedBy = "medication")
    private List<Medication_Image> medicationImageList;

    @OneToMany(mappedBy = "medication")
    private List<SurgeryHistory_Medication> surgeryHistoryMedicationList;

    @OneToMany(mappedBy = "medication")
    private List<Medication_MedicationCategory> medicationMedicationCategoryList;

}
