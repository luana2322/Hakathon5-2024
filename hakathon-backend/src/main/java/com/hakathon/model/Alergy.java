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
@Table(name="alergy")

public class Alergy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="alergy_id")
    private Long alergy_id;

    private String alergy_name;
    private String description;
    private String cause;
    private String treatment;

    @OneToMany(mappedBy = "alergy")
    private List<MedialRecord_Alergy> medialRecordAlergyList;
}
