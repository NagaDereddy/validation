package com.naga.validation.service;

import com.naga.validation.dto.PersonalDetails;
import com.naga.validation.dto.Professional;
import com.naga.validation.exceptions.PersonalException;
import com.naga.validation.repository.PersonalDetailsRepository;
import com.naga.validation.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessionalServiceImpl implements ProfessionalService{


    @Autowired
    public ProfessionalRepository repository;

    @Autowired
    public PersonalDetailsRepository personalRepo;




    @Override
    public Professional saveProfessional(Professional professional) {
        return repository.save(professional);
    }

    @Override
    public List<Professional> getAllProfessionalDetails() {

        List<Professional> professional=new ArrayList<>();

        professional=repository.findAll();
        professional.stream();

        return repository.findAll();
    }

    @Override
    public Optional<Professional> getProfessionals(int prf_id) {
        return repository.findById(prf_id);
    }

    @Override
    public PersonalDetails personaldetails(PersonalDetails person) {
        return personalRepo.save(person);
    }

    @Override
    public List<PersonalDetails> getAllPersonalDetails() {
        return personalRepo.findAll();
    }

    @Override
    public PersonalDetails getPersonalDetailById(Integer personId) {
        return personalRepo.findByPersonId(personId);
    }

    @Override
    public PersonalDetails updatePersonalDetails(PersonalDetails person) {
        return null;
    }

    @Override
    public PersonalDetails getPersonalByName(String name) throws PersonalException {
        return personalRepo.findByProfessionalName(name);
    }
}
