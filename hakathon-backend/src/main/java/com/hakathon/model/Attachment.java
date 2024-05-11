package com.hakathon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "attachment")

public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attachment_id")
    private Long attachment;

    private String thumb_url;
    private String file_url;
    private Date created_At;
    private Date updated_At;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "message_id",referencedColumnName = "message_id")
    private Message message;
}
