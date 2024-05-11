package com.hakathon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="nurse")
public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nurse_id")
    private Long nurse_id;


    private String image_url;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String phone;
    private Date date_of_birth;
    private String CCCD;
    private String gender;
    private String address;
    private Date created_At;
    private boolean is_activated;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id",referencedColumnName = "department_id")
    private Department department;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id",referencedColumnName = "city_id")
    private City city;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "specialty_id",referencedColumnName = "specialty_id")
    private Specialty specialty;


    @OneToMany(mappedBy = "nurse")
    private List<SurgeryHistory_Nurse> surgeryHistoryNurseList;

    @OneToMany(mappedBy = "nurse")
    private List<MedicalSnapshot_Nurse> medicalSnapshotNurseList;

    @OneToMany(mappedBy = "nurse")
    private List<MedicalHistory_Nurse> medicalHistoryNurseList;

}
