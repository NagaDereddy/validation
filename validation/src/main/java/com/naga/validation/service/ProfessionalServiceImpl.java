package com.naga.validation.service;

import com.naga.validation.dto.PersonalDetails;
import com.naga.validation.dto.Professional;
import com.naga.validation.exceptions.PersonalException;
import com.naga.validation.repository.PersonalDetailsRepository;
import com.naga.validation.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalServiceImpl implements ProfessionalService{

    @Autowired
    ProfessionalRepository repository;

    @Autowired
    PersonalDetailsRepository personaldetails;


    @Override
    public Professional saveProfessional(Professional professional) {
        return repository.save(professional);
    }

    @Override
    public List<Professional> getAllProfessionalDetails() {
        List<Professional> professionals=repository.findAll();
          if(professionals!= null){
              System.out.println(professionals.size());
              return professionals;
          }
        return null;
    }

    @Override
    public Professional getProfessionals(int prf_id) {
        return repository.getReferenceById(prf_id);
    }

//    @Override
//    public Professional getProfessionalByName(String name) {
//        return repository.findByPrf_name(name);
//    }



//    @Override
//    public Professional getProfessionalByQuery(Integer prf_id) {
//        return repository.findByPrf_Id(prf_id);
//    }


    @Override
    public PersonalDetails personaldetails(PersonalDetails person) {
        return personaldetails.save(person);
    }

    @Override
    public List<PersonalDetails> getAllPersonalDetails() {
        return personaldetails.findAll();
    }

    @Override
    public PersonalDetails getPersonalDetailById(Integer personId) {
        System.out.println("person Id"+personId);
        //System.out.println((Integer)personId);
        return personaldetails.findByPersonId(personId);
    }

    @Override
    public PersonalDetails updatePersonalDetails(PersonalDetails person) {
        PersonalDetails existingDetails=personaldetails.findByPersonId(person.getPersonId());

        if(existingDetails != null){
            existingDetails.setProfessionalName(person.getProfessionalName());
            existingDetails.setEmail(person.getEmail());
            existingDetails.setAge(person.getAge());
            existingDetails.setGender(person.getGender());
            existingDetails.setPhoneNumber(person.getPhoneNumber());
            return personaldetails.save(existingDetails);
        }else{
           return null;
        }
    }

    @Override
    public PersonalDetails getPersonalByName(String name) throws PersonalException {

        PersonalDetails person= personaldetails.findByProfessionalName(name);
        if(person!= null) {
            return person;
        }else{
            throw new PersonalException("User details not found with the Name "+name);
        }
    }


}
