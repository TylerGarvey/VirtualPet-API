export function makeOneOrganicDog(petJson) {
    return `
    <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petHunger">Hunger Level: ${petJson.hungerLevel}</p>
            <p class="petThirst">Thirst Level: ${petJson.thirstLevel}</p>
            <p class="petBoredom">Boredom Level: ${petJson.boredomLevel}</p>
            <p class="cageCleanliness">Cage Cleanliness Level: ${petJson.cageCleanliness}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}"/>
            <input type="button"  value="FEED ME" onclick="feedOrganicDog(${petJson.id})"/>
            <input type="button"  value="GIVE ME DRINK" onclick="waterOrganicDog(${petJson.id})"/>
            <input type="button"  value="PLAY WITH ME" onclick="playWithOrganicDog(${petJson.id})"/>
            <input type="button"  value="CLEAN CAGE" onclick="cleanOrganicDogCage(${petJson.id})"/>
            <input type="button"  value="WALK ME" onclick="walkOrganicDog(${petJson.id})"/>
        </div>
    `
}

export function makeOneOrganicCat(petJson) {
    return `
    <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petHunger">Hunger Level: ${petJson.hungerLevel}</p>
            <p class="petThirst">Thirst Level: ${petJson.thirstLevel}</p>
            <p class="petBoredom">Boredom Level: ${petJson.boredomLevel}</p>
            <p class="litterboxCleanliness">Litterbox Cleanliness Level: ${petJson.litterBoxCleanliness}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}"/>
            <input type="button"  value="FEED ME" onclick="feedOrganicCat(${petJson.id})"/>
            <input type="button"  value="GIVE ME DRINK" onclick="waterOrganicCat(${petJson.id})"/>
            <input type="button"  value="PLAY WITH ME" onclick="playWithOrganicCat(${petJson.id})"/>
            <input type="button"  value="CLEAN LITTER" onclick="cleanOrganicCatLitterbox(${petJson.id})"/>
        </div>
    `
}

export function makeOneRoboticDog(petJson) {
    return `
    <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petOil">Oil Level: ${petJson.oil}</p>
            <p class="petMaintenance">Maintenance Level: ${petJson.maintenance}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}"/>
            <input type="button"  value="OIL ME" onclick="oilRoboticDog(${petJson.id})"/>
            <input type="button"  value="MAINTAIN ME" onclick="maintainRoboticDog(${petJson.id})"/>
            <input type="button"  value="WALK ME" onclick="walkRoboticDog(${petJson.id})"/>
        </div>
    `
}

export function makeOneRoboticCat(petJson) {
    return `
    <div>
            <h1 class="petName">${petJson.name}</h1>
            <p class="petOil">Oil Level: ${petJson.oil}</p>
            <p class="petMaintenance">Maintenance Level: ${petJson.maintenance}</p>
            <p class="petId">PET ID: ${petJson.id}</p>
            <input type="hidden" class="petID" value="${petJson.id}"/>
            <input type="button"  value="OIL ME" onclick="oilRoboticCat(${petJson.id})"/>
            <input type="button"  value="MAINTAIN ME" onclick="maintainRoboticCat(${petJson.id})"/>
        </div>
    `
}