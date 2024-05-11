package com.hakathon.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="vaccation_history")

public class Vaccination_History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vaccation_history_id")
    private Long vaccation_history_id;

    private String vaccine_name;
    private LocalDate date;
    private String location;
    private String dosage;
    private String note;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medialrecord_id",referencedColumnName = "medialrecord_id")
    private Medial_Record medialRecord;
}
