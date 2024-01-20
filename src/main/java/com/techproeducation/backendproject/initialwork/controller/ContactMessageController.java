package com.techproeducation.backendproject.initialwork.controller;


import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import com.techproeducation.backendproject.initialwork.service.ContactMessageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/contactMessages")  // http://localhost:8080/contactMessages
public class ContactMessageController {
    @Autowired
    private ContactMessageService contactMessageService;

    //Create Contact Message

    @PostMapping//http://localhost:8080/contactMessages +POST+JSON
    public ResponseEntity<Map<String, String>> createContactMessage(@Valid @RequestBody ContactMessage contactMessage) {
        contactMessageService.createContactMessage(contactMessage);

        Map<String, String> map = new HashMap<>();
        map.put("message", "ContactMessage has been created successfully.!");
        map.put("status", "true");

        return new ResponseEntity<>(map, HttpStatus.CREATED);


    }

    //Get All Contact Messages
    @GetMapping //http://localhost:8080/contactMessages +GET
    public ResponseEntity<List<ContactMessage>> getAll() {
        List<ContactMessage> contactMessages = contactMessageService.getAll();
        return ResponseEntity.ok(contactMessages);
    }

    //Get All Contact Messages by Page
    @GetMapping("/page") //http://localhost:8080/contactMessages/page?p=1&size=3&sort=id&direction=ASC
    public ResponseEntity<Page<ContactMessage>> getAllContactMessagesByPage(@RequestParam("p") int pageNum,
                                                                            @RequestParam("size") int size,
                                                                            @RequestParam("sort") String sort,
                                                                            @RequestParam("direction") Sort.Direction direction
    ) {
        Pageable pageable = PageRequest.of(pageNum, size, Sort.by(direction, sort));
        Page<ContactMessage> contactMessagePage = contactMessageService.getAllByPage(pageable);

        return ResponseEntity.ok(contactMessagePage);
    }

    //Get Search Contact Message by subject
    @GetMapping("/querySubject")  // http://localhost:8080/contactMessages/querySubject?subject=x1?
    public ResponseEntity<List<ContactMessage>> getContactMessageBySubject(@RequestParam("subject") String subject) {

        List<ContactMessage> contactMessages = contactMessageService.getContactMessageBySubject(subject);

        return ResponseEntity.ok(contactMessages);

    }

    //Get contact message by email

    @GetMapping("/queryEmail")  // http://localhost:8080/contactMessages/queryEmail?email=ca@gmail.com
    public ResponseEntity<List<ContactMessage>> getContactMessageByEmail(@RequestParam("email") String email) {

        List<ContactMessage> contactMessages = contactMessageService.getContactMessageByEmail(email);

        return ResponseEntity.ok(contactMessages);
    }
}
