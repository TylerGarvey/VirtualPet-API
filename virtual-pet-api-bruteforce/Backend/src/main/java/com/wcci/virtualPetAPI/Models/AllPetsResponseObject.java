package com.wcci.virtualPetAPI.Models;

public class AllPetsResponseObject {
    private Iterable<RoboticCat> roboticCats;
    private Iterable<OrganicCat> organicCats;
    private Iterable<RoboticDog> roboticDogs;
    private Iterable<OrganicDog> organicDogs;



    public Iterable<RoboticCat> getRoboticCats() {
        return roboticCats;
    }

    public void setRoboticCats(Iterable<RoboticCat> roboticCats) {
        this.roboticCats = roboticCats;
    }

    public Iterable<OrganicCat> getOrganicCats() {
        return organicCats;
    }

    public void setOrganicCats(Iterable<OrganicCat> organicCats) {
        this.organicCats = organicCats;
    }

    public Iterable<RoboticDog> getRoboticDogs() {
        return roboticDogs;
    }

    public void setRoboticDogs(Iterable<RoboticDog> roboticDogs) {
        this.roboticDogs = roboticDogs;
    }

    public Iterable<OrganicDog> getOrganicDogs() {
        return organicDogs;
    }

    public void setOrganicDogs(Iterable<OrganicDog> organicDogs) {
        this.organicDogs = organicDogs;
    }

}
