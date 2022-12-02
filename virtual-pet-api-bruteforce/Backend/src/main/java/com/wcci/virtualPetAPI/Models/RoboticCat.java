package com.wcci.virtualPetAPI.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RoboticCat {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int oil;
    private int maintenance;
    @ManyToOne
    @JsonIgnore
    private Shelter shelter;


    public RoboticCat(String name, int oil, int maintenance, Shelter shelter) {
        this.name = name;
        this.oil = oil;
        this.maintenance = maintenance;
        this.shelter = shelter;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public RoboticCat() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOil() {
        return oil;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void oil() {
        oil -= 20;
    }

    public void maintain() {
        maintenance -= 20;
    }

    public String status() {
        return this.name + "'s oil level is " + this.oil + "\n" +
        this.name + "'s maintenance level is " + this.maintenance;

    }

    public void tick() {
        oil += 5;
        maintenance += 5;

        if (this.oil > 100) {
            this.oil = 100;
        }
        if (this.maintenance > 100) {
            this.maintenance = 100;
        }
        if (this.oil < 0) {
            this.oil = 0;
        }
        if (this.maintenance < 0) {
            this.maintenance = 0;
        }
    }

    public String showPet() {
        if (this.oil >= 66 || this.maintenance >= 66) {
            return("-  -   -     -   -   --   -    -     - -   -  _  -    -  -      -  - -  -  -  -\n" +
                    "=-   - =- = - =  -  =- =   _.----~~~~~~-----..__ =   =-   -=-  - = =  -=--  = -\n" +
                    "=#-=  =-# - == ##= -__..------~~~~-     .._     ~~-. #== -#- = =-  ##=-= =#- -\n" +
                    "#===#==___.--.--~~~~     --~~~~---~ __  ~~----.__   ~~~~~~~---...._____#== =##=\n" +
                    "##(~~~~_..----~       ~~--=(|||)- .----. -(|||)=--~~             ..   .)#=#=##=\n" +
                    "###~-..__..--         ..  ___-----_...__-----___        _.  ~-=___..-~#########\n" +
                    "##==#===#==`   _    ..   (     \" :_.}{._; \" \"   )      _-     '==#=##=====#=#==\n" +
                    "=#-==-== =# \\   ~~-      `   \" \" __###__  \"\"    '    -~     .'==-=#===#- -=- #=\n" +
                    "-= == -=  -= `-._  ~-.    _`--~~~VvvvvVV~~---'_     ~..    _. #= =  =  ==# - ==\n" +
                    " = -==  - = - == -.     `~##\\(            )/###~' .     _.~    -=- = -= -=- -\n" +
                    "= -  -= -   - -    -    `.###\\#    {     #/####.'    _-~  - =  - - -  -    = -\n" +
                    " -    -       -  -  -_    -####    !     #####-  ..    -    -       -   -   - -\n" +
                    "                      -._  ~.###   }     ###-~ ___.-~\n" +
                    "                         ~-  \\##  / \"   ##.~ /~                      \n" +
                    "                           \\ |###  \"   ###' /   \n" +
                    "                            \\`/\\#######/\\' ;                               \n" +
                    "                             ~-.^^^^^^^ .-~                                    \n" +
                    "                                ~~~~~~~~\n");
        }
        else if (this.oil >= 33 || this.maintenance >= 33) {
            return("    /\\_____/\\\n" +
                    "   /(||) (||)\\\n" +
                    "  ( ==  ^  == )\n" +
                    "   )         (\n" +
                    "  (           )\n" +
                    " ( (  )   (  ) )\n" +
                    "(__(__)___(__)__)\n");
        }
        else {
            return("           .'\\   /`.\n" +
                    "         .'.-.`-'.-.`.\n" +
                    "    ..._:   .-. .-.   :_...\n" +
                    "  .'    '-(|||) (|||)-'    `.\n" +
                    " :  _    _ _`~(_)~`_ _    _  :\n" +
                    ":  /:   ' .-=_   _=-. `   ;\\  :\n" +
                    ":   :|-.._  '     `  _..-|:   :\n" +
                    " :   `:| |`:-:-.-:-:'| |:'   :\n" +
                    "  `.   `.| | | | | | |.'   .'\n" +
                    "    `.   `-:_| | |_:-'   .'\n" +
                    "      `-._   ````    _.-'\n" +
                    "          ``-------''\n");
        }
    }
}
