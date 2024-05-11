package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository  extends JpaRepository<Attachment,Long> {
}
