package com.naga.validation.advicers;

import com.naga.validation.exceptions.PersonalException;
import jakarta.validation.UnexpectedTypeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class PersonAdviceController {

//    @ExceptionHandler(UnexpectedTypeException.class)
//    public Map<String,String> handleInvalidPatternException(UnexpectedTypeException invalidExceptions){
//        Map<String,String> errorMap= new HashMap<>();
//        return null;

    //    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleInvalidPatternException(MethodArgumentNotValidException invalidExceptions){
        Map<String,String> errorMap= new HashMap<>();
        invalidExceptions.getBindingResult().getFieldErrors().forEach(error -> {
        errorMap.put(error.getField(), error.getDefaultMessage());
      });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(PersonalException.class)
    public Map<String,String> handleUserNotFoundByName(PersonalException message){
        Map<String,String> personDetails= new HashMap<>();
        personDetails.put("not found",message.getMessage());
        return personDetails;

    }




}
