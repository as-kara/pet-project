package com.epam.askara.util;

import com.epam.askara.model.Pet;
import com.epam.askara.model.enums.Gender;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("all")
class PetUtilsTest {

    @Test
    void petNameConcatenate() {
        List a = new ArrayList();
        a.add(Pet.builder().name("A").build());
        a.add(Pet.builder().name("B").build());
        var result = PetUtils.petNameConcatenate(a);
        assertEquals("A,B", result);
    }

    @Test
    void petNameConcatenate2() {
        List list = new ArrayList();
        list.add(Pet.builder().name("A").build());
        var result = PetUtils.petNameConcatenate(list);
        assertEquals("A", result);
    }

    @Test
    void petUniqueNameConcatenate() {
        List list = new ArrayList();
        list.add(Pet.builder().name("A").build());
        list.add(Pet.builder().name("B").build());
        list.add(Pet.builder().name("A").build());
        var s = PetUtils.petUniqueNameConcatenate(list);
        assertEquals("A,B", s);
    }

    @Test
    void getGenderMessage() {
        var result = PetUtils._GETGenderMessage(Gender.FEMALE);
        assertEquals("This is Female", result);
    }
}