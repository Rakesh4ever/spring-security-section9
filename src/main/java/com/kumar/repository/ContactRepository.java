package com.kumar.repository;

import com.kumar.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author RakeshKumar created on 18/01/24
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
