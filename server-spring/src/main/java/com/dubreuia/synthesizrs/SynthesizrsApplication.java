package com.dubreuia.synthesizrs;

import com.dubreuia.synthesizrs.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SynthesizrsApplication {

    @Autowired
    private ApplicationService applicationService;

    public static void main(String[] args) {
        SpringApplication.run(SynthesizrsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            applicationService.insertData();
        };
    }

}
