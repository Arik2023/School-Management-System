package com.techproeducation.backendproject.initialwork.repository;

import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
    List<ContactMessage> findAllBySubject(String subject);

    List<ContactMessage> findAllByEmail(String email);
}
