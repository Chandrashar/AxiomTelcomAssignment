package com.chan.axiom;


import com.chan.axiom.model.Mobile;
import com.chan.axiom.repository.MobileRepository;
import com.chan.axiom.service.DeviceService;
import com.chan.axiom.service.MobileService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.kaczmarzyk.spring.data.jpa.web.SpecificationArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom.model
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.chan.axiom")
@EnableAutoConfiguration
public class AxiomTelcomAssignmentApplication implements WebMvcConfigurer {

    @Autowired
    MobileRepository mobileRepository;

    public static void main(String[] args) {
        SpringApplication.run(AxiomTelcomAssignmentApplication.class, args);
    }
    //DeviceRepository deviceRepository;

    //@Autowired
    //private ApplicationContext appContext;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new SpecificationArgumentResolver());
        argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
    }


    @Bean
    CommandLineRunner runner(MobileService mobileService, DeviceService deviceService) {

        return args -> {
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<Mobile>> listTypeReference = new TypeReference<List<Mobile>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream("/mobiledb/mobile_database.json");

            try {
                List<Mobile> handSets = objectMapper.readValue(inputStream, listTypeReference);
                mobileService.save(handSets);
                System.out.println(" Mobile Handsets Save into DB!!");
                deviceService.save(deviceService.load(handSets));
               // mobileRepository.deleteAll();
            } catch (IOException io) {
                System.out.println("Unable to save Mobile Handsets into DB: - " + io.getLocalizedMessage());
            }

        };
    }
}