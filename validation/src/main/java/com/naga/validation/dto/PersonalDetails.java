package com.naga.validation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "professionaldetails")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class PersonalDetails {
    @Id
    private Integer personId;
    @NotNull(message = "Professional Name should not be empty")
    private String professionalName;
    @Email(message = "Email should not be empty")
    private String email;
    //@Pattern(regexp = "\\d{10}",message = "Phone Number should not be empty")
    @Digits(integer = 10, message = "Phone number must be a 10-digit number", fraction = 0)
    //@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private long phoneNumber;
    @Min(value = 22,message = "age less than 22 not allowed")
    @Max(value = 60,message = "age less than 60 not allowed")
    private int age;

    @NotNull(message = "Gender should not be empty")
    private String gender;
    @NotNull(message = "Nationality should not be empty")
    private String nationality;

}
