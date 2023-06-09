package service;

import dto.ContactDTO;
import entity.Contact;
import mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ContactRepository;

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
