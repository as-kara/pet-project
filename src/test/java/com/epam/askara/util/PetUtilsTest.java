package com.epam.askara.util;

import com.epam.askara.model.Pet;
import com.epam.askara.model.enums.Gender;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetUtilsTest {

    static Stream<Arguments> getPets() {
        var sample = List.<Pet>of(Pet.builder().name("A").build(),
                Pet.builder().name("B").build(),
                Pet.builder().id(1L).build());

        var sample2 = List.<Pet>of(Pet.builder().name("A").build());

        return Stream.of(
                Arguments.of(sample, "A,B"),
                Arguments.of(sample2, "A"));
    }

    @ParameterizedTest
    @MethodSource("getPets")
    void petNameConcatenate(List pets, String expected) {
        // given & when
        var actual = PetUtils.petNameConcatenate(pets);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void petUniqueNameConcatenate() {
        // given
        var list = List.<Pet>of(Pet.builder().name("A").build(),
                Pet.builder().name("B").build(),
                Pet.builder().name("A").build());

        // when
        var actual = PetUtils.petUniqueNameConcatenate(list);

        // then
        assertEquals("A,B", actual);
    }

    @Test
    void getGenderMessage() {
        // given & when
        var actual = PetUtils.getGenderMessage(Gender.FEMALE);

        // then
        assertEquals("This is Female", actual);
    }
}