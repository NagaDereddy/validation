package com.naga.validation.controller;

import com.naga.validation.dto.PersonalDetails;
import com.naga.validation.dto.Professional;
import com.naga.validation.exceptions.PersonalException;
import com.naga.validation.service.ProfessionalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/professional")
@Validated
public class ProfessionalController {

    @Autowired
    ProfessionalService professionalService;

    @PostMapping(value="/saveProfessional" ,consumes="Application/JSON")
    public ResponseEntity<Professional> saveProfessional(@RequestBody @Valid Professional professional){


      return new ResponseEntity<>(professionalService.saveProfessional(professional),HttpStatus.CREATED);


    }
    @GetMapping(value = "/getAllProfessionals")
    public @ResponseBody List<Professional>  getAllProfessionals(){

        return professionalService.getAllProfessionalDetails();
    }

    @GetMapping(value = "/getProfessional/{prfId}")
    public @ResponseBody Optional<Professional> getProfessional(@PathVariable int prfId){

        return professionalService.getProfessionals(prfId);
    }
//     using this getting an error beans creation

//    @GetMapping(value = "/getProfessionalByName/{name}")
//    public @ResponseBody Professional getProfessional(@PathVariable String name){
//
//        return professionalService.getProfessionalByName(name);
//    }

//    @GetMapping(value = "/getProfessionalByQuery/{prfId}")
//    public @ResponseBody Professional getProfessionalByQuery(@PathVariable int prfId){
//
//        return professionalService.getProfessionalByQuery(prfId);
//    }



    @PostMapping(value="/savePersonalDetails" ,consumes="Application/JSON")
    public @ResponseBody PersonalDetails savePersonalDetails(@RequestBody @Valid PersonalDetails person){

        //System.out.println(person.getPersonId());

        return professionalService.personaldetails(person);
    }

    @GetMapping(value = "/getAllPersonalDetails")
    public @ResponseBody List<PersonalDetails>  getAllPersonalDetails(){

        return professionalService.getAllPersonalDetails();
    }

    @GetMapping(value = "/getPersonalDetailById/{personId}")
    public @ResponseBody PersonalDetails  getPersonalDetailById(@PathVariable int personId){

        return professionalService.getPersonalDetailById((Integer)personId);
    }

    @PutMapping(value = "/updatePersonalDetails" ,consumes="Application/JSON")
    public @ResponseBody PersonalDetails  updatePersonalDetails(@RequestBody @Valid PersonalDetails person){

        return professionalService.updatePersonalDetails(person);
    }

    @GetMapping(value = "/getPersonalByName/{name}")
    public @ResponseBody PersonalDetails getPersonalByName(@PathVariable String name) throws PersonalException {

        return professionalService.getPersonalByName(name);
    }


}
