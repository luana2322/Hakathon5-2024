package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="medialrecord_alergy")
public class MedialRecord_Alergy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medialrecord_alergy_id")
    private Long medialrecord_alergy_id;
    private String alergy_type_name;
    private String severity_level;
    private String note;
    private Date created_At;
    private Date updated_At;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medialrecord_id",referencedColumnName = "medialrecord_id")
    private Medial_Record medial_record;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="alergy_id",referencedColumnName = "alergy_id")
    private Alergy alergy;
}
