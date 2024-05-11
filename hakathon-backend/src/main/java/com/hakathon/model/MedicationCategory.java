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
@Table(name="medication_category")
public class MedicationCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medication_category_id")
    private Long medication_category_id;
    private String medicationCategory_name;
    private String description;


    @OneToMany(mappedBy = "medication_category")
    private List<Medication_MedicationCategory> medicationMedicationCategoryList;
}
