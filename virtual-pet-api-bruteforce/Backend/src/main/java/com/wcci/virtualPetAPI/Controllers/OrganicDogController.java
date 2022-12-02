package com.wcci.virtualPetAPI.Controllers;

import com.wcci.virtualPetAPI.Models.OrganicDog;
import com.wcci.virtualPetAPI.Repos.OrganicDogRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrganicDogController {
    private OrganicDogRepository organicDogRepo;


    public OrganicDogController(OrganicDogRepository organicDogRepo) {
        this.organicDogRepo = organicDogRepo;
    }


    @GetMapping("/organicDogs")
    public Iterable<OrganicDog> getAllOrganicsDogs() {
        return organicDogRepo.findAll();
    }

    @GetMapping("/organicDogs/{id}")
    public OrganicDog getDogById(@PathVariable long id) {
        return organicDogRepo.findById(id).get();
    }

   /*@PostMapping("/organicDogs")
    public Iterable<OrganicDog> addNewOrganicDog(@RequestBody OrganicDog newOrganicDog) {
        organicDogRepo.save(newOrganicDog);
        return organicDogRepo.findAll();
    }*/

    @PutMapping("/organicDog/{id}/cleanCage")
    public OrganicDog cleanDogCage(@PathVariable long id) {
        OrganicDog ogd = organicDogRepo.findById(id).get();
        ogd.cleanCage();
        ogd.tick();
        organicDogRepo.save(ogd);
        return organicDogRepo.findById(id).get();
    }

    @PutMapping("/organicDog/{id}/feedDog")
    public OrganicDog feedDog(@PathVariable long id) {
        OrganicDog ogd = organicDogRepo.findById(id).get();
        ogd.feed();
        ogd.tick();
        organicDogRepo.save(ogd);
        return organicDogRepo.findById(id).get();
    }

    @PutMapping("/organicDog/{id}/playWithDog")
    public OrganicDog playWithDog(@PathVariable long id) {
        OrganicDog ogd = organicDogRepo.findById(id).get();
        ogd.play();
        ogd.tick();
        organicDogRepo.save(ogd);
        return organicDogRepo.findById(id).get();
    }

    @PutMapping("/organicDog/{id}/giveDogWater")
    public OrganicDog giveDogWater(@PathVariable long id) {
        OrganicDog ogd = organicDogRepo.findById(id).get();
        ogd.drink();
        ogd.tick();
        organicDogRepo.save(ogd);
        return organicDogRepo.findById(id).get();
    }

    @PutMapping("/organicDog/{id}/walkDog")
    public OrganicDog walkDog(@PathVariable long id) {
        OrganicDog ogd = organicDogRepo.findById(id).get();
        ogd.walk();
        ogd.tick();
        organicDogRepo.save(ogd);
        return organicDogRepo.findById(id).get();
    }

    @GetMapping("/organicDog/{id}/showStatus")
    public String showDog(@PathVariable long id) {
        OrganicDog ogd = organicDogRepo.findById(id).get();
        return ogd.showPet();
//        organicDogRepo.save(ogd);

    }

}




