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
@Table(name="conversation")

public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="conversation_id")
    private Long conversation_id;
    private String tilte;
    private Date created_At;
    private Date updated_At;


    @OneToMany(mappedBy = "conversation")
    private List<Message> messageList;


    @OneToMany(mappedBy = "conversation")
    private List<Call> callList;

}
