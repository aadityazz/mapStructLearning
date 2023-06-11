package com.example.mapstructlearning.mapper;

import com.example.mapstructlearning.dto.ContactDTO;
import com.example.mapstructlearning.entity.Contact;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    Contact toEntity(ContactDTO contactDTO);

    ContactDTO toDTO(Contact contact);

    List<ContactDTO> toDtoList(List<Contact> contacts);
}
