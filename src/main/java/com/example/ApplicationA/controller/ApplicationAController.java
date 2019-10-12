package com.example.ApplicationA.controller;

import com.example.ApplicationA.model.AppADto;
import com.example.ApplicationA.service.AppAService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ApplicationAController {

    @Autowired
    AppAService appAService;

    @GetMapping("/AppA")
    public ResponseEntity index(){
        System.out.println("Called CallAppA()");
        AppADto appADto = appAService.callAppBEndpoint();

        return new ResponseEntity(appADto, HttpStatus.OK);
    }
}
