package com.naga.validation.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.net.URLConnection;

@Component
public class ValidationHealthCheck implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        return checkInternetConnection() == true ? Health.up().withDetail("Status code", "internet connection is Active").build():Health.down().withDetail("error code","internet connection is InActive").build();
    }

    public boolean checkInternetConnection(){
        boolean flag=false;
        try{
            URL con=new URL("https://www.google.com");
            URLConnection connection=con.openConnection();
            connection.connect();
            return flag=true;
        }catch (Exception e){
            return flag=false;
        }
    }

}
