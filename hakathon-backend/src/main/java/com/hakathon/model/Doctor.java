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
@Table(name="doctor")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doctor_id")
    private Long doctor_id;

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
    @JoinColumn(name = "role_id",referencedColumnName = "role_id")
    private Role role;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id",referencedColumnName = "city_id")
    private City city;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "specialty_id",referencedColumnName = "specialty_id")
    private Specialty specialty;



    @OneToMany(mappedBy = "doctor")
    private List<Doctor_Review> doctorReviewList;


    @OneToMany(mappedBy = "doctor")
    private List<Call> callList;


    @OneToMany(mappedBy = "doctor")
    private List<Message> messageList;


    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointmentList;


    @OneToMany(mappedBy = "doctor")
    private List<Doctor_Degree> doctorDegreeList;


    @OneToMany(mappedBy = "doctor")
    private List<Doctor_Role> doctorRoleList;


    @OneToMany(mappedBy = "doctor")
    private List<Doctor_Specialty> doctorSpecialtyList;

    @OneToMany(mappedBy = "doctor")
    private List<SurgeryHistory_Doctor> surgeryHistoryDoctorList;

    @OneToMany(mappedBy = "doctor")
    private List<MedicalHistory_Doctor> medicalHistoryDoctorList;

    @OneToMany(mappedBy = "doctor")
    private List<MedicalSnapshot_Doctor> medicalSnapshotDoctorList;

}
