package com.wcci.virtualPetAPI.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RoboticDog {
    @Id
    @GeneratedValue

    private Long Id;

    public String name;

    public int maintenance;

    public int oil;

    @ManyToOne
    @JsonIgnore
    private Shelter shelter;

    public RoboticDog(String name, int maintenance, int oil, Shelter shelter) {
        this.name = name;
        this.maintenance = maintenance;
        this.oil = oil;
        this.shelter = shelter;
    }

    public RoboticDog() {

    }

    public Long getId() {
        return Id;
    }

    public String name() {
        return name;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getOil() {
        return oil;
    }

    public void oil(){
        oil -= 20;
    }

    public void maintenance(){
        maintenance -= 20;
    }

    public String status() {
        return this.name + "'s oil level is " + this.oil + "\n" +
                this.name + "'s maintenance level is " + this.maintenance;

    }
    public String showPet(){
        if (this.oil >= 66 || this.maintenance >= 66) {
            return ("        __      _\n" +
                    "        \\.'---.//|\n" +
                    "         |\\./|  \\/\n" +
                    "        (||)(||) \\\n" +
                    "       /(  ) ' '  \\\n" +
                    "      |  \\/   . |  \\\n" +
                    "       \\_/\\__/| |\n" +
                    "        V  /V / |\n" +
                    "          /__/ /\n" +
                    "          \\___/\\|\n");
        }

        else if (this.oil >= 33 || this.maintenance >= 33) {
            return("   ,_____ ,\n" +
                    "  ,._ ,_. 7\\\n" +
                    " j `-'     /\n" +
                    " (||) (||)  \\\n" +
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
                    "       /   (|||)  (|||)  |    \\_/\n" +
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

    public void tick() {
        oil += 5;
        maintenance += 5;

        if(this.oil > 100){
            this.oil= 100;
        }
        if (this.oil < 0){
            this.oil= 0;
        }
        if(this.maintenance > 100){
             this.maintenance= 100;
        }
        if(this.maintenance < 0){
            this.maintenance= 0;
        }
    }
    public void walkPet() {
        this.oil += 10;
        this.maintenance += 10;
    }

    public void setShelter(Shelter newshelter) {
        this.shelter = newshelter;
    }
}





