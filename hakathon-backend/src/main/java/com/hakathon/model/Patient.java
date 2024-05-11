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
@Table(name="patient")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="patient_id")
    private Long patient_id;


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
    @JoinColumn(name = "city_id",referencedColumnName = "city_id")
    private City city;



    @OneToMany(mappedBy = "patient")
    private List<Doctor_Review> doctorReviewList;


    @OneToMany(mappedBy = "patient")
    private List<Message> messageList;


    @OneToMany(mappedBy = "patient")
    private List<Call> callList;


    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList;


    @OneToMany(mappedBy = "patient")
    private List<Medial_Record> medialRecordList;



}
