package com.epam.askara.business;

import com.epam.askara.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.parsers.SAXParserFactory;

import static org.junit.jupiter.api.Assertions.*;

class PetsForCareTest {

    private PetsForCare petsForCare;

    @BeforeEach
    void setUp() {
        petsForCare = new PetsForCare();
    }

    @Test
    void addPet() {
        petsForCare.addPet(Pet.builder().id(1L).name("Pet").build());
        assertNotNull(petsForCare.getPets());
    }

    @Test
    void getPets() {
        petsForCare.addPet(Pet.builder().id(1L).name("Pet").build());
        var actual = petsForCare.getPets().get(0);
        assertEquals(1, actual.getId());
        assertEquals("Pet", actual.getName());
    }
}