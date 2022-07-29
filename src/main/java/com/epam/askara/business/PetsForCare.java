package com.epam.askara.business;

import com.epam.askara.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetsForCare {
    private final List<Pet> pets;

    public PetsForCare() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public List<Pet> getPets(){
        return pets;
    }
}
