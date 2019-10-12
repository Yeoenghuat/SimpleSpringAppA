package com.example.ApplicationA.service;

import com.example.ApplicationA.externalDto.AppBDto;
import com.example.ApplicationA.model.AppADto;
import com.example.ApplicationA.service.converter.AppADtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppAService {

    @Value("${urlProps}")
    private String urlProps;

    @Value("${URL}")
    private String urlEnv;

    @Autowired
    private Environment env;

    public AppADto callAppBEndpoint(){
        System.out.println("Value from @Value: " + urlProps);
        System.out.println("Value from @ValueEnv: " + urlEnv);
        System.out.println("Value from System.getenv(): " + env.getProperty("URL"));

        RestTemplate restTemplate = new RestTemplate();
        String toCallUrl = urlEnv + "/CallAppB";

        System.out.println("Calling Application B now!");
        ResponseEntity responseEntity = restTemplate.getForEntity(toCallUrl, AppBDto.class);
        AppBDto appBDto = (AppBDto) responseEntity.getBody();

        AppADto appADto = AppADtoConverter.convert(appBDto);

        return appADto;

    }

}
