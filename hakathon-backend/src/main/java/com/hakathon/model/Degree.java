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
@Table(name="degree")

public class Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="degree_id")
    private Long degree_id;
    private String degree_name;
     private String level;
     private String description;

    @OneToMany(mappedBy = "degree")
    private List<Doctor_Degree> doctorDegreeList;
}
