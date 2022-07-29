package com.epam.askara.business;

import com.epam.askara.model.Pet;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class PetsForCare {
    private final List pets;

    public PetsForCare() {
        pets = new ArrayList();
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public List getPets(){
        return pets;
    }
}
