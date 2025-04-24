package com.ead.course.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter @AllArgsConstructor
public class ModuleDto {

    @NotBlank
    private String title;

    @NotBlank
    private String Description;
}
