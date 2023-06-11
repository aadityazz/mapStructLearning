package com.example.mapstructlearning.repository;

import com.example.mapstructlearning.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
