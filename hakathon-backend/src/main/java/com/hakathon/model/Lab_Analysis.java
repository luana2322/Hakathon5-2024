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
@Table(name="lab_analysis")

public class Lab_Analysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="labanalysis_id")
    private Long labanalysis_id;

    private String test_name;
    private Date test_date;
    private String sample_test;
    private String test_result;
    private String resultStatus;
    private String note;
    private String testType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medical_snapshot_id",referencedColumnName = "medical_snapshot_id")
    private Medical_Snapshot medical_snapshot;

    @OneToMany(mappedBy = "lab_analysis")
    private List<LabType_LabAnalysis> labTypeLabAnalysisList;




}
