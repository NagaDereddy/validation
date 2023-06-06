package com.naga.validation.service;

import com.naga.validation.dto.PersonalDetails;
import com.naga.validation.dto.Professional;
import com.naga.validation.exceptions.PersonalException;

import java.util.List;
import java.util.Optional;

public interface ProfessionalService {
    public Professional saveProfessional(Professional professional);

    public List<Professional> getAllProfessionalDetails();

    public Optional<Professional> getProfessionals(int prf_id);

    //Professional getProfessionalByQuery(Integer prf_id);

    public PersonalDetails personaldetails(PersonalDetails person);

    public List<PersonalDetails> getAllPersonalDetails();

    public PersonalDetails getPersonalDetailById(Integer personId);

    public PersonalDetails updatePersonalDetails(PersonalDetails person);

    public PersonalDetails getPersonalByName(String name) throws PersonalException;


    // Professional getProfessionalByName(String name);
}
