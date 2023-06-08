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
    @Column(name = "prfId")
    //@GeneratedValue(strategy = GenerationType.TABLE)
    private Integer prfId;
    @NotNull(message = "Professional Name should not be null")
    @Column(name = "prfName")
    private  String prfName;
    @NotNull(message = "Professional Company Name should not be null")
    @Column(name = "prfCompany")
    private  String prfCompany;
    @NotNull(message = "Professional Employment Type should not be null")
    @Column(name = "employmentType")
    private  String employmentType;


}
