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
@Table(name="labtype_labanalysis")

public class LabType_LabAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="labtype_labanalysis_id")
    private Long labtype_labanalysis_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "labtype_id",referencedColumnName = "labtype_id")
    private LabType labtype;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="labanalysis_id",referencedColumnName = "labanalysis_id")
    private Lab_Analysis lab_analysis;

}
