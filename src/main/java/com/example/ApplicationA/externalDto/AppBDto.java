package com.example.ApplicationA.externalDto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppBDto implements Serializable {

    private String title;
    private String message;
}
