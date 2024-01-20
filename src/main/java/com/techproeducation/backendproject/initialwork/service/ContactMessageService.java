package com.techproeducation.backendproject.initialwork.service;

import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import com.techproeducation.backendproject.initialwork.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactMessageService {
    @Autowired
    private ContactMessageRepository contactMessageRepository;

    public void createContactMessage(ContactMessage contactMessage) {
        contactMessageRepository.save(contactMessage);
    }

    public List<ContactMessage> getAll() {
        return contactMessageRepository.findAll();
    }

    public Page<ContactMessage> getAllByPage(Pageable pageable) {
        return contactMessageRepository.findAll(pageable);
    }

    public List<ContactMessage> getContactMessageBySubject(String subject) {
        return contactMessageRepository.findAllBySubject(subject);
    }

    public List<ContactMessage> getContactMessageByEmail(String email) {

        return contactMessageRepository.findAllByEmail(email);
    }
}
