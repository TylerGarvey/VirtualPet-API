export function makeOrganicDog(petJson) {
    return `
        <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petHunger">Hunger Level: ${petJson.hungerLevel}</p>
            <p class="petThirst">Thirst Level: ${petJson.thirstLevel}</p>
            <p class="petBoredom">Boredom Level: ${petJson.boredomLevel}</p>
            <p class="cageCleanliness">Cage Cleanliness Level: ${petJson.cageCleanliness}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}"/>
            <input type="button" class="adoptPet" value="ADOPT ME" onclick="adoptOrganicDog(${petJson.id})"/>
            <input type="button" class="inspectPet" value="CLOSER LOOK" onclick="inspectOrganicDog(${petJson.id})"/>
        </div>
    `
}

export function makeOrganicCat(petJson) {
    return `
        <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petHunger">Hunger Level: ${petJson.hungerLevel}</p>
            <p class="petThirst">Thirst Level: ${petJson.thirstLevel}</p>
            <p class="petBoredom">Boredom Level: ${petJson.boredomLevel}</p>
            <p class="litterboxCleanliness">Litterbox Cleanliness Level: ${petJson.litterBoxCleanliness}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}">
            <input type="button" class="adoptPet" value="ADOPT ME" onclick="adoptOrganicCat(${petJson.id})">
            <input type="button" class="inspectPet" value="CLOSER LOOK" onclick="inspectOrganicCat(${petJson.id})"/>
        </div>
    `
}

export function makeRoboticDog(petJson) {
    return `
        <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petOil">Oil Level: ${petJson.oil}</p>
            <p class="petMaintenance">Maintenance Level: ${petJson.maintenance}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}">
            <input type="button" class="adoptPet" value="ADOPT ME" onclick="adoptRoboticDog(${petJson.id})">
            <input type="button" class="inspectPet" value="CLOSER LOOK" onclick="inspectRoboticDog(${petJson.id})"/>
        </div>
    `
}

export function makeRoboticCat(petJson) {
    return `
        <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petOil">Oil Level: ${petJson.oil}</p>
            <p class="petMaintenance">Maintenance Level: ${petJson.maintenance}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}">
            <input type="button" class="adoptPet" value="ADOPT ME" onclick="adoptRoboticCat(${petJson.id})">
            <input type="button" class="inspectPet" value="CLOSER LOOK" onclick="inspectRoboticCat(${petJson.id})"/>
        </div>
    `
}