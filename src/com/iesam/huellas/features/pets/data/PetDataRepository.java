package com.iesam.huellas.features.pets.data;

import com.iesam.huellas.features.pets.domain.Pet;
import com.iesam.huellas.features.pets.domain.PetRepository;

import java.util.ArrayList;

public class PetDataRepository implements PetRepository {

    @Override
    public ArrayList<Pet> obtainPet() {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("1","Petunia","Gato blanco","Hembra","21-12-2023","url.Petunia.com"));
        return pets;
    }
}
