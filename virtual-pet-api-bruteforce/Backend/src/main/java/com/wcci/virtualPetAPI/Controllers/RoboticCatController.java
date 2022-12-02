package com.wcci.virtualPetAPI.Controllers;

import com.wcci.virtualPetAPI.Models.RoboticCat;
import com.wcci.virtualPetAPI.Repos.RoboticCatRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoboticCatController {
    private RoboticCatRepository roboticCatRepo;

    public RoboticCatController(RoboticCatRepository roboticCatRepo) {
        this.roboticCatRepo = roboticCatRepo;
    }

    @GetMapping("/roboticCats")
    public Iterable<RoboticCat> getAllCats() {
        return roboticCatRepo.findAll();
    }

    @GetMapping("/roboticCats/{id}")
    public RoboticCat getRoboticCatById(@PathVariable long id) {
        return roboticCatRepo.findById(id).get();
    }

    /*@PostMapping("/roboticCats")
    public Iterable<RoboticCat> postNewRoboticCat(@RequestBody RoboticCat newRobotCat) {
        roboticCatRepo.save(newRobotCat);
        return roboticCatRepo.findAll();
    }*/

    @PutMapping("/roboticCats/{id}/oil")
    public RoboticCat oilRoboticCatById(@PathVariable long id) {
        RoboticCat rc = roboticCatRepo.findById(id).get();
        rc.oil();
        rc.tick();
        roboticCatRepo.save(rc);
        return roboticCatRepo.findById(id).get();
    }

    @PutMapping("/roboticCats/{id}/maintain")
    public RoboticCat maintainRoboticCatById(@PathVariable long id) {
        RoboticCat rc = roboticCatRepo.findById(id).get();
        rc.maintain();
        rc.tick();
        roboticCatRepo.save(rc);
        return roboticCatRepo.findById(id).get();
    }
}
