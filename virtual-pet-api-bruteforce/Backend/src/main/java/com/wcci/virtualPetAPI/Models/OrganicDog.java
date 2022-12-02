package com.wcci.virtualPetAPI.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wcci.virtualPetAPI.Models.Shelter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrganicDog {


    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int cageCleanliness;
    @ManyToOne
    @JsonIgnore
    private Shelter shelter;
    public OrganicDog(String name, int hungerLevel, int thirstLevel, int boredomLevel, int cageCleanliness, Shelter shelter){
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.cageCleanliness = cageCleanliness;
        this.shelter = shelter;
    }


    public OrganicDog(){}

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void cleanCage() {
        this.cageCleanliness -= 20;
    }

    public void feed() {this.hungerLevel -= 20;}

    public void play(){
        this.boredomLevel -= 20;
    }

    public void drink() {
        this.thirstLevel -= 20;
    }
    public void walk(){
        this.boredomLevel -= 10;
        this.cageCleanliness -= 10;
}
    public void tick(){
        this.cageCleanliness += 5;
        this.hungerLevel += 5;
        this.thirstLevel += 5;
        this.boredomLevel += 5;
        this.cageCleanliness += 5;
        if (this.cageCleanliness > 100) {
            this.cageCleanliness = 100;
        }
        if (this.cageCleanliness < 0) {
            this.cageCleanliness = 0;
        }
        if (this.hungerLevel > 100) {
            this.hungerLevel = 100;
        }
        if (this.thirstLevel > 100) {
            this.thirstLevel = 100;
        }
        if (this.boredomLevel > 100) {
            this.boredomLevel = 100;
        }
        if (this.hungerLevel < 0) {
            this.hungerLevel = 0;
        }
        if (this.thirstLevel < 0) {
            this.thirstLevel = 0;
        }
        if (this.boredomLevel < 0) {
            this.boredomLevel = 0;
        }
    }

    public String status(){
        return this.name + "\nHunger Level:  " + this.hungerLevel + "\nThirst Level: " + this.thirstLevel + "\nBoredom Level: " + this.boredomLevel +"\nCage Cleanliness Level: " + this.cageCleanliness;

    }
    public void setShelter(Shelter newShelter){
        shelter = newShelter;
    }
    public String showPet() {
        if (this.hungerLevel >= 66 || this.thirstLevel >= 66 || this.boredomLevel >= 66 || this.cageCleanliness >= 66) {
            return("        __      _\n" +
                    "        \\.'---.//|\n" +
                    "         |\\./|  \\/\n" +
                    "        _|.|.|_  \\\n" +
                    "       /(  ) ' '  \\\n" +
                    "      |  \\/   . |  \\\n" +
                    "       \\_/\\__/| |\n" +
                    "        V  /V / |\n" +
                    "          /__/ /\n" +
                    "          \\___/\\|\n");
        }

        else if (this.hungerLevel >= 33 || this.thirstLevel >= 33 || this.boredomLevel >= 33 || this.cageCleanliness >= 33) {
            return("   ,_____ ,\n" +
                    "  ,._ ,_. 7\\\n" +
                    " j `-'     /\n" +
                    " |o_, o    \\\n" +
                    ".`_y_`-,'   !\n" +
                    "|/   `, `._ `-,\n" +
                    "|_     \\   _.'*\\\n" +
                    "  >--,-'`-'*_*'``---.\n" +
                    "  |\\_* _*'-'         '\n" +
                    " /    `               \\\n" +
                    " \\.         _ .       /\n" +
                    "  '`._     /   )     /\n" +
                    "   \\  |`-,-|  /c-'7 /\n" +
                    "    ) \\ (_,| |   / (_\n" +
                    "   ((_/   ((_;)  \\_)))\n");
        }
        else {
            return("  ,_-~~~-,    _-~~-_\n" +
                    " /        ^-_/      \\_    _-~-.\n" +
                    "|      /\\|  ,          `-_/     \\\n" +
                    "|   /~^\\ '/  /~\\  /~\\   / \\_    \\\n" +
                    " \\_/    }/  /        \\  \\ ,_\\    }\n" +
                    "        Y  /  /~  /~  |  Y   \\   |\n" +
                    "       /   | {Q) {Q)  |  |    \\_/\n" +
                    "       |   \\  _===_  /   |\n" +
                    "       /  >--{     }--<  \\\n" +
                    "     /~       \\_._/       ~\\\n" +
                    "    /    *  *   Y    *      \\\n" +
                    "    |      * .: | :.*  *    |\n" +
                    "    \\    )--__==#==__--     /\n" +
                    "     \\_      \\  \\  \\      ,/\n" +
                    "       '~_    | |  }   ,~'\n" +
                    "          \\   {___/   /\n" +
                    "           \\   ~~~   /\n" +
                    "           /\\._._._./\\\n" +
                    "          {    ^^^    }\n" +
                    "           ~-_______-~\n" +
                    "            /       \\\n");
            }
        }

    }
