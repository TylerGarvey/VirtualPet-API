package com.wcci.virtualPetAPI.Controllers;

import com.wcci.virtualPetAPI.Models.RoboticDog;
import com.wcci.virtualPetAPI.Repos.RoboticDogRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoboticDogController {
    private RoboticDogRepository roboticDogRepo;

    public RoboticDogController(RoboticDogRepository roboticDogRepo) {
        this.roboticDogRepo = roboticDogRepo;
    }
    @GetMapping("/roboticDogs")
    public Iterable<RoboticDog>getAllDogs(){
        return roboticDogRepo.findAll();
    }
    @GetMapping("/roboticDogs/{id}")
    public RoboticDog getRoboticDogById(@PathVariable long id){
        return roboticDogRepo.findById(id).get();
    }

    /*@PostMapping("/roboticDogs")
    public Iterable<RoboticDog>addNewRoboticDog(@RequestBody RoboticDog newRoboticDog){
        roboticDogRepo.save(new RoboticDog());
        return roboticDogRepo.findAll();
    }*/
    @PutMapping("/roboticDogs/{id}/oil")
    public RoboticDog oilRoboticDogById(@PathVariable long id) {
        RoboticDog rd = roboticDogRepo.findById(id).get();
        rd.oil();
        rd.tick();
        roboticDogRepo.save(rd);
        return roboticDogRepo.findById(id).get();
    }
    @PutMapping("/roboticDogs/{id}/maintain")
    public RoboticDog maintainRoboticDogById(@PathVariable long id) {
        RoboticDog rd = roboticDogRepo.findById(id).get();
        rd.maintenance();
        rd.tick();
        roboticDogRepo.save(rd);
        return roboticDogRepo.findById(id).get();
    }

    @PutMapping("/roboticDogs/{id}/walk")
    public RoboticDog walkRoboticDogById(@PathVariable long id) {
        RoboticDog rd = roboticDogRepo.findById(id).get();
        rd.walkPet();
        rd.tick();
        roboticDogRepo.save(rd);
        return roboticDogRepo.findById(id).get();
    }
}
