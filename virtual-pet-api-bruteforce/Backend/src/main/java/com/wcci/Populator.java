package com.wcci;

import com.wcci.virtualPetAPI.Models.*;
import com.wcci.virtualPetAPI.Repos.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Populator implements CommandLineRunner {
    private ShelterRepository shelterRepo;
    private OrganicDogRepository organicDogRepo;
    private RoboticCatRepository roboticCatRepo;
    private OrganicCatRepository organicCatRepo;
    private RoboticDogRepository roboticDogRepo;
    public Populator(OrganicDogRepository organicDogRepo, RoboticCatRepository roboticCatRepo, OrganicCatRepository organicCatRepo, RoboticDogRepository roboticDogRepo, ShelterRepository shelterRepo){
        this.shelterRepo = shelterRepo;
        this.organicDogRepo= organicDogRepo;
        this.roboticCatRepo = roboticCatRepo;
        this.organicCatRepo = organicCatRepo;
        this.roboticDogRepo = roboticDogRepo;
    }


    @Override
    public void run(String... args) throws Exception {
        Shelter catsShelter = new Shelter("Cats Shelter");
        shelterRepo.save(catsShelter);

        Shelter dogsShelter = new Shelter("Dogs Shelter");
        shelterRepo.save(dogsShelter);

        OrganicDog organicDog1 = new OrganicDog("Freddy", 50,50,50,50, dogsShelter);
        organicDogRepo.save(organicDog1);

        OrganicDog organicDog2 = new OrganicDog("Jason",50,50,50,50, dogsShelter);
        organicDogRepo.save(organicDog2);

        RoboticCat beast = new RoboticCat("Beast", 50, 50, catsShelter);
        roboticCatRepo.save(beast);

        OrganicCat organicCat1 = new OrganicCat("Sally", 35, 25, 25, 10, catsShelter);
        organicCatRepo.save(organicCat1);

        OrganicCat organicCat2 = new OrganicCat("Butterfly", 20, 32, 45, 2, catsShelter);
        organicCatRepo.save(organicCat2);

        RoboticDog roboticDog = new RoboticDog("Athena",10,10, dogsShelter);
        roboticDogRepo.save(roboticDog);

    }
}
