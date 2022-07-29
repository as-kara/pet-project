package com.epam.askara.util;

import com.epam.askara.model.Pet;
import com.epam.askara.model.enums.Gender;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Slf4j
public class PetUtils {

    public static final String A = "Test A";

    public static String petNameConcatenate(List<Pet> pets) {
        return pets.stream()
                .map(t -> t.getName())
                .map(t -> t)
                .filter(Objects::nonNull)
                .collect(Collectors.joining(","));
    }

    public static String petUniqueNameConcatenate(List<Pet> pets) {
        return pets.stream()
                .map(t -> t.getName())
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.joining(","));
    }

    public static String _GETGenderMessage(@NonNull Gender gender) {
        String result;

        switch (gender) {
            default:
                result = "Non-defined";
            case FEMALE:
                result = "This is Female";
                break;
            case MALE:
                result = "It is Male";
                break;
        }

        return result;
    }
}
