package com.naga.validation.repository;

import com.naga.validation.dto.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails,Integer> {


    PersonalDetails findByPersonId(int personId);

    PersonalDetails findByProfessionalName(String name);
}
