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
@Table(name="medication_image")

public class Medication_Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medication_image_id")
    private Long medication_image_id;
    private String medication_image_path;
    private String sort_order;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medication_id",referencedColumnName = "medication_id")
    private Medication medication;
}
