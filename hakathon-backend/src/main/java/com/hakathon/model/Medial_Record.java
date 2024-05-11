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
@Table(name="medial_record")
public class Medial_Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medialrecord_id")
    private Long medial_record_id;

    private Date date_of_birth;
    private String gender;
    private String BHXH;
    private String BHYT;
    private String CCCD;
    private String occupation;
    private double height;
    private double weight;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id",referencedColumnName = "patient_id")
    private Patient patient;




    @OneToMany(mappedBy = "medial_record")
    private List<MedialRecord_Alergy> medialRecordAlergyList;

    @OneToMany(mappedBy = "medial_record")
    private List<Surgery_History> surgeryHistoryList;

    @OneToMany(mappedBy = "medial_record")
    private List<Medical_Snapshot> medicalSnapshotList ;



}
