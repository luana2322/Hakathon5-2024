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
@Table(name="medication_medicationcategory")

public class Medication_MedicationCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medication_medicationcategory_id")
    private Long medication_medicationcategory_id;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medication_id",referencedColumnName = "medication_id")
    private Medication medication;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medication_category_id",referencedColumnName = "medication_category_id")
    private MedicationCategory medication_category;

}
