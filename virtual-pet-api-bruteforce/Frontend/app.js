import { makeOrganicCat, makeOrganicDog, makeRoboticCat, makeRoboticDog } from "./Components/Pet.js";
import { makeOneOrganicDog, makeOneOrganicCat, makeOneRoboticDog, makeOneRoboticCat } from "./Components/individualPetView.js";

// import makeOrganicDog from "./Components/Pet.js";
const feedAllButton = document.querySelector(".feedAll");
const waterAllButton = document.querySelector(".waterAll");
const adoptAllButton = document.querySelector(".adoptAll");
const playAllButton = document.querySelector(".playAll");
const maintainAllButton = document.querySelector(".maintainAll");
const oilAllButton = document.querySelector(".oilAll");
const cleanAllButton = document.querySelector(".cleanAll");
const walkAllButton = document.querySelector(".walkAll");
const inspectPet = document.querySelectorAll(".inspectPet");

document.getElementById("fetchAll").onclick = (ev) => {
    getAllPets()
}

function getAllPets() {
    fetch("http://localhost:8080/shelter/showAllPets")
    .then(res => res.json())
    .then(pets => {
        showAllPets(pets);
    })
    .catch(err => console.error(err));
}

function showAllPets(petsJson) {
    console.log(petsJson);
    container.innerHTML = "";
    petsJson.organicCats.forEach(oc => container.innerHTML += makeOrganicCat(oc));
    petsJson.organicDogs.forEach(od =>  container.innerHTML += makeOrganicDog(od));
    petsJson.roboticCats.forEach(rc =>  container.innerHTML += makeRoboticCat(rc));
    petsJson.roboticDogs.forEach(rd =>  container.innerHTML += makeRoboticDog(rd));
}

window.inspectOrganicDog = function inspectOrganicDog(id) {
    fetch(`http://localhost:8080/organicDogs/${id}`)
    .then(res => res.json())
    .then(pet => {
        showOneOrganicDog(pet);
    })
}

function showOneOrganicDog(petJson) {
    console.log(petJson);
    container.innerHTML = "";
    const petHTML = makeOneOrganicDog(petJson);
    container.innerHTML += petHTML;
}

window.feedOrganicDog = function feedOrganicDog(id) {
    fetch(`http://localhost:8080/organicDog/${id}/feedDog`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicDog(res);
    })
    .catch(err => console.error(err));
}

window.waterOrganicDog = function waterOrganicDog(id) {
    fetch(`http://localhost:8080/organicDog/${id}/giveDogWater`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicDog(res);
    })
    .catch(err => console.error(err));
}

window.playWithOrganicDog = function playWithOrganicDog(id) {
    fetch(`http://localhost:8080/organicDog/${id}/playWithDog`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicDog(res);
    })
    .catch(err => console.error(err));
}

window.cleanOrganicDogCage = function cleanOrganicDogCage(id) {
    fetch(`http://localhost:8080/organicDog/${id}/cleanCage`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicDog(res);
    })
    .catch(err => console.error(err));
}

window.walkOrganicDog = function walkOrganicDog(id) {
    fetch(`http://localhost:8080/organicDog/${id}/walkDog`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicDog(res);
    })
    .catch(err => console.error(err));
}

window.inspectOrganicCat = function inspectOrganicCat(id) {
    fetch(`http://localhost:8080/organicCats/${id}`)
    .then(res => res.json())
    .then(pet => {
        showOneOrganicCat(pet);
    })
}

function showOneOrganicCat(petJson) {
    console.log(petJson);
    container.innerHTML = "";
    const petHTML = makeOneOrganicCat(petJson);
    container.innerHTML += petHTML;
}

window.feedOrganicCat = function feedOrganicCat(id) {
    fetch(`http://localhost:8080/organicCats/${id}/feedCat`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicCat(res);
    })
    .catch(err => console.error(err));
}

window.waterOrganicCat = function waterOrganicCat(id) {
    fetch(`http://localhost:8080/organicCats/${id}/giveCatDrink`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicCat(res);
    })
    .catch(err => console.error(err));
}

window.playWithOrganicCat = function playWithOrganicCat(id) {
    fetch(`http://localhost:8080/organicCats/${id}/play`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicCat(res);
    })
    .catch(err => console.error(err));
}

window.cleanOrganicCatLitterbox = function cleanOrganicCatLitterbox(id) {
    fetch(`http://localhost:8080/organicCats/${id}/cleanLitter`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneOrganicCat(res);
    })
    .catch(err => console.error(err));
}

window.inspectRoboticDog = function inspectORoboticDog(id) {
    fetch(`http://localhost:8080/roboticDogs/${id}`)
    .then(res => res.json())
    .then(pet => {
        showOneRoboticDog(pet);
    })
}

function showOneRoboticDog(petJson) {
    console.log(petJson);
    container.innerHTML = "";
    const petHTML = makeOneRoboticDog(petJson);
    container.innerHTML += petHTML;
}

window.oilRoboticDog = function oilRoboticDog(id) {
    fetch(`http://localhost:8080/roboticDogs/${id}/oil`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneRoboticDog(res);
    })
    .catch(err => console.error(err));
}

window.maintainRoboticDog = function maintainRoboticDog(id) {
    fetch(`http://localhost:8080/roboticDogs/${id}/maintain`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneRoboticDog(res);
    })
    .catch(err => console.error(err));
}

window.walkRoboticDog = function walkRoboticDog(id) {
    fetch(`http://localhost:8080/roboticDogs/${id}/walk`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneRoboticDog(res);
    })
    .catch(err => console.error(err));
}

window.inspectRoboticCat = function inspectORoboticCat(id) {
    fetch(`http://localhost:8080/roboticCats/${id}`)
    .then(res => res.json())
    .then(pet => {
        showOneRoboticCat(pet);
    })
}

function showOneRoboticCat(petJson) {
    console.log(petJson);
    container.innerHTML = "";
    const petHTML = makeOneRoboticCat(petJson);
    container.innerHTML += petHTML;
}

window.oilRoboticCat = function oilRoboticCat(id) {
    fetch(`http://localhost:8080/roboticCats/${id}/oil`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneRoboticCat(res);
    })
    .catch(err => console.error(err));
}

window.maintainRoboticCat = function maintainRoboticCat(id) {
    fetch(`http://localhost:8080/roboticCats/${id}/maintain`, {
        method: "PUT"
    }
        )
    .then(res => res.json())
    .then(res => {
        showOneRoboticCat(res);
    })
    .catch(err => console.error(err));
}

window.adoptOrganicDog = function adoptOrganicDog(id) {
    fetch(`http://localhost:8080/shelter/adoptOrganicDog/${id}`, {
        method:"DELETE" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

window.adoptOrganicCat = function adoptOrganicCat(id) {
    fetch(`http://localhost:8080/shelter/adoptOrganicCat/${id}`, {
        method:"DELETE" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

window.adoptRoboticCat = function adoptRoboticCat(id) {
    fetch(`http://localhost:8080/shelter/adoptRoboticCat/${id}`, {
        method:"DELETE" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

window.adoptRoboticDog = function adoptRoboticDog(id) {
    fetch(`http://localhost:8080/shelter/adoptRoboticDog/${id}`, {
        method:"DELETE" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

document.getElementById("waterAll").onclick = (ev) => {
    waterAllPets();
}

document.getElementById("feedAll").onclick = (ev) => {
    feedAllPets();
}
document.getElementById("playAll").onclick = (ev) => {
    playWithAllPets();
}
document.getElementById("maintainAll").onclick = (ev) => {
    maintainRobots();
}
document.getElementById("oilAll").onclick = (ev) => {
    oilRobots();
}
document.getElementById("adoptAll").onclick = (ev) => {
    adoptAllPets();
}
document.getElementById("cleanAll").onclick = (ev) => {
    cleanOrganicCages();
}
document.getElementById("walkAll").onclick = (ev) => {
    walkAllDogs();
}

function feedAllPets (){
    fetch("http://localhost:8080/shelter/feedAll", {
        method:"PUT" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

function waterAllPets (){
    fetch("http://localhost:8080/shelter/waterAll", {
        method:"PUT" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

function adoptAllPets (){
    fetch("http://localhost:8080/shelter/adoptAll", {
        method:"DELETE" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

function playWithAllPets (){
    fetch("http://localhost:8080/shelter/playWithAll", {
        method:"PUT" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

function maintainRobots (){
    fetch("http://localhost:8080/shelter/maintainAll", {
        method:"PUT" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

function oilRobots (){
    fetch("http://localhost:8080/shelter/oilAll", {
        method:"PUT" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

function cleanOrganicCages (){
    fetch("http://localhost:8080/shelter/cleanAll", {
        method:"PUT" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

function walkAllDogs (){
    fetch("http://localhost:8080/shelter/walkAll", {
        method:"PUT" 
    })
    .then(res => {
        if(res.status == 200) getAllPets();
    })
    .catch(err => console.error(err));
}

const container = document.querySelector(".container");
const catName = document.querySelector(".ocName");
const rcName = document.querySelector(".rcName");
const dogName = document.querySelector(".odName");
const rdName = document.querySelector(".rdName")
const catHunger = document.querySelector(".ocHunger");
const dogHunger = document.querySelector(".odHunger");
const catThirst = document.querySelector(".ocThirst");
const dogThirst = document.querySelector(".odThirst");
const catBoredom = document.querySelector(".ocBoredom");
const dogBoredom = document.querySelector(".odBoredom");
const catLitter = document.querySelector(".ocLitterBox");
const dogCage = document.querySelector(".odCage");
const catOil = document.querySelector(".rcOil");
const dogOil = document.querySelector(".rdOil");
const catMaintenance = document.querySelector(".rcMaintenance");
const dogMaintenance = document.querySelector(".rdMaintenance");
const addOrganicCatButton = document.querySelector(".addCat");
const addRoboticCatButton = document.querySelector(".addRoboticCat");
const addOrganicDogButton = document.querySelector(".addDog");
const addRoboticDogButton = document.querySelector(".addRoboticDog");

container.innerText = "Which type of pet would you like to admit?"

// Organic Cat Functions
function getAllCats() {
    fetch("http://localhost:8080/organicCats/")
    .then(res => res.json())
    .then(cats => {
        showAllCats(cats);
        })
    .catch(err => console.error(err));
}

function showAllCats(catsJson) {
    console.log(catsJson);
    container.innerHTML = "";
    catsJson.forEach(cat => {
        const catHTML = makeOrganicCat(cat);

        container.innerHTML += catHTML; 
    });
}
 getAllCats();

addOrganicCatButton.addEventListener("click", () => {
    const newCatJson = {
        "name": catName.value,
        "hungerLevel": catHunger.value,
        "thirstLevel": catThirst.value,
        "boredomLevel": catBoredom.value,
        "litterBoxCleanliness": catLitter.value
    }
    fetch("http://localhost:8080/shelter/1/admitOrganicCat", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(newCatJson)
    })
  
    .then(catsJson => {
        getAllCats();
    })
})

// Robotic Cat Functions
function getAllRoboticCats() {
    fetch("http://localhost:8080/roboticCats/")
    .then(res => res.json())
    .then(roboticCats => {
        showAllRoboticCats(roboticCats);
        })
    .catch(err => console.error(err));
}   

function showAllRoboticCats(roboticCatsJson) {
    console.log(roboticCatsJson);
    container.innerHTML = "";
    roboticCatsJson.forEach(roboticCat => {
        const roboticCatHTML = makeRoboticCat(roboticCat);

        container.innerHTML += roboticCatHTML;
    });
}
    getAllRoboticCats();

addRoboticCatButton.addEventListener("click", () => {
    const newRoboticCatJson = {
        "name": rcName.value,
        "oil": catOil.value,
        "maintenance": catMaintenance.value
    }
    fetch("http://localhost:8080/shelter/1/admitRoboticCat", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(newRoboticCatJson)
    })

    .then(roboticCatsJson => {
        getAllRoboticCats();
    })
})

// Organic Dog functions

function getAllDogs() {
    fetch("http://localhost:8080/organicDogs/")
    .then(res => res.json())
    .then(dogs => {
        showAllDogs(dogs);
        })
    .catch(err => console.error(err));
}   

function showAllDogs(dogsJson) {
    console.log(dogsJson);
    container.innerHTML = "";
    dogsJson.forEach(dog => {
        const dogHTML = makeOrganicDog(dog);

        container.innerHtML += dogHTML;
    });
}
 getAllDogs();

addOrganicDogButton.addEventListener("click", () => {
    const newDogJson = {
        "name": dogName.value,
        "hungerLevel": dogHunger.value,
        "thirstLevel": dogThirst.value,
        "boredomLevel": dogBoredom.value,
        "cageCleanliness": dogCage.value
    }
    fetch("http://localhost:8080/shelter/1/admitOrganicDog", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(newDogJson)
    })

    .then(dogsJson => {
        getAllDogs();
    })
})

//Robotic Dog Functions

function getAllRoboticDogs() {
    fetch("http://localhost:8080/roboticDogs/")
    .then(res => res.json())
    .then(roboticDogs => {
        showAllRoboticDogs(roboticDogs);
        })
    .catch(err => console.error(err));
}   
function showAllRoboticDogs(roboticDogsJson) {
    console.log(roboticDogsJson);
    container.innerHTML = "";
    roboticDogsJson.forEach(roboticDog => {
        const roboticDogHTML = makeRoboticDog(roboticDog);

        container.innerHTML += roboticDogHTML;

    });
}
    getAllRoboticDogs();

addRoboticDogButton.addEventListener("click", () => {
    const newRoboticDogJson = {
        "name": rdName.value,
        "oil": dogOil.value,
        "maintenance": dogMaintenance.value
    }
    fetch("http://localhost:8080/shelter/1/admitRoboticDog", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(newRoboticDogJson)
    })
   
    .then(roboticDogsJson => {
        getAllRoboticDogs();
    })
})
