package com.naga.validation.actuator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "healthEndPoint",enableByDefault = true)
public class ValidationEndPoint {

     @ReadOperation
     public HealthPoint statusOfHealth(){
          return new HealthPoint(200,"internet","Active");
     }

}
