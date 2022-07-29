package com.epam.askara.model;

import com.epam.askara.model.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {
    private Long id;
    private String name;
    private String description;
    private Gender gender;
}