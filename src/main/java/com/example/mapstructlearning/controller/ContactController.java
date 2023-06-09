package com.example.mapstructlearning.controller;

import com.example.mapstructlearning.dto.ContactDTO;
import com.example.mapstructlearning.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.mapstructlearning.service.ContactService;

import java.util.List;

@Controller
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/contact")
    public ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO){
        return ResponseEntity.ok(contactService.saveContact(contactDTO));
    }

    @GetMapping("/contact/id")
    public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id){
        return ResponseEntity.ok(contactService.saveContactById(id));
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<ContactDTO>> getContactList(){
        return ResponseEntity.ok(contactService.getContactList());
    }
}
