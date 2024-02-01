package com.techproeducation.backendproject.schoolmanagement.contactmessage.mapper;

import com.techproeducation.backendproject.schoolmanagement.contactmessage.dto.ContactMessageRequest;
import com.techproeducation.backendproject.schoolmanagement.contactmessage.dto.ContactMessageResponse;
import com.techproeducation.backendproject.schoolmanagement.contactmessage.entity.ContactMessage;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ContactMessageMapper {

    public ContactMessageResponse contactMessageToResponse(ContactMessage contactMessage){
        return ContactMessageResponse.builder()
                .name(contactMessage.getName())
                .subject(contactMessage.getSubject())
                .message(contactMessage.getMessage())
                .email(contactMessage.getEmail())
                .dateTime(LocalDateTime.now())
                .build();
    }

    //TODO please check builder design pattern
    //I would give this method a name like mapContactMessageRequestToContactMessage
    public ContactMessage requestToContactMessage(ContactMessageRequest contactMessageRequest){
        return ContactMessage.builder()
                .name(contactMessageRequest.getName())
                .subject(contactMessageRequest.getSubject())
                .message(contactMessageRequest.getMessage())
                .email(contactMessageRequest.getEmail())
                .dateTime(LocalDateTime.now())
                .build();
    }
}
