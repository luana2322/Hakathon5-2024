package com.hakathon.repository;

import com.hakathon.model.Admin;
import com.hakathon.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository  extends JpaRepository<Message,Long> {
}
