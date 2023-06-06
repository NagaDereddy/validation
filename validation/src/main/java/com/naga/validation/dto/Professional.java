package com.naga.validation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name ="professionals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Professional {
    @Id
    @Column(name = "prf_Id")
    //@GeneratedValue(strategy = GenerationType.TABLE)
    private Integer prf_Id;
    @NotNull(message = "Professional Name should not be null")
    @Column(name = "prf_name")
    private  String prf_name;
    @NotNull(message = "Professional Company Name should not be null")
    @Column(name = "prf_company")
    private  String prf_company;
    @NotNull(message = "Professional Employment Type should not be null")
    @Column(name = "employment_type")
    private  String employment_type;


}
