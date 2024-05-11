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
@Table(name="nurse_specialty")

public class Nurse_Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nurse_specialty_id")
    private Long nurse_specialty_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nurse_id",referencedColumnName = "nurse_id")
    private Nurse nurse;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="specialty_id",referencedColumnName = "specialty_id")
    private Specialty specialty;

}
