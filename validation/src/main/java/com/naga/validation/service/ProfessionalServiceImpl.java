package com.naga.validation.service;

import com.naga.validation.dto.PersonalDetails;
import com.naga.validation.dto.Professional;
import com.naga.validation.exceptions.PersonalException;

import java.util.List;

public class ProfessionalServiceImpl implements ProfessionalService{


    
    @Override
    public Professional saveProfessional(Professional professional) {
        return null;
    }

    @Override
    public List<Professional> getAllProfessionalDetails() {
        return null;
    }

    @Override
    public Professional getProfessionals(int prf_id) {
        return null;
    }

    @Override
    public PersonalDetails personaldetails(PersonalDetails person) {
        return null;
    }

    @Override
    public List<PersonalDetails> getAllPersonalDetails() {
        return null;
    }

    @Override
    public PersonalDetails getPersonalDetailById(Integer personId) {
        return null;
    }

    @Override
    public PersonalDetails updatePersonalDetails(PersonalDetails person) {
        return null;
    }

    @Override
    public PersonalDetails getPersonalByName(String name) throws PersonalException {
        return null;
    }
}
