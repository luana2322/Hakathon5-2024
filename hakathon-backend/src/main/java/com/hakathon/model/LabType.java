package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="labtype")

public class LabType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="labtype_id")
    private Long labtype_id;

    private String labtype_name;
    private String description;


    @OneToMany(mappedBy = "labtype")
    private List<LabType_LabAnalysis> labTypeLabAnalysisList;

}
