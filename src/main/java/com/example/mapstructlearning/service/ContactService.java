package com.example.mapstructlearning.service;

import com.example.mapstructlearning.dto.ContactDTO;
import com.example.mapstructlearning.entity.Contact;
import com.example.mapstructlearning.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mapstructlearning.repository.ContactRepository;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Autowired
    ContactMapper contactMapper;

    public Contact saveContact(ContactDTO contactDTO){
        return contactRepository.save(contactMapper.toEntity(contactDTO));
    }

    public ContactDTO saveContactById(Long id){
        return contactRepository.findById(id).map(contactMapper::toDTO).orElse(new ContactDTO());
    }

    public List<ContactDTO> getContactList(){
        List<Contact> contacts = contactRepository.findAll();
        return contactMapper.toDtoList(contacts);
    }
}
