package com.example.ApplicationA.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppADto implements Serializable {

    private String title;
    private String message;
    private String messageInCaps;
}
