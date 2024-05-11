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
@Table(name="message")

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="message_id")
    private Long message_id;
    private String message_content;
    private Date send_At;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id",referencedColumnName = "doctor_id")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id",referencedColumnName = "patient_id")
    private Patient patient;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "conversation_id",referencedColumnName = "conversation_id")
    private Conversation conversation;



    @OneToMany(mappedBy = "message")
    private List<Attachment> attachmentList;

}
