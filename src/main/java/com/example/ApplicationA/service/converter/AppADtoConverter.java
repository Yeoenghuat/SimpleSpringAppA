package com.example.ApplicationA.service.converter;

import com.example.ApplicationA.externalDto.AppBDto;
import com.example.ApplicationA.model.AppADto;

public class AppADtoConverter {

    public static AppADto convert(AppBDto appBDto){

        String messageInCaps = appBDto.getMessage().toUpperCase();

        AppADto appADto = AppADto.builder()
                .title(appBDto.getTitle())
                .message(appBDto.getMessage())
                .messageInCaps(messageInCaps)
                .build();

        return appADto;
    }
}
