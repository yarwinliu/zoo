
/*
 */
public abstract class Animal
{

    String name;
    String colour;
    Food food;
    Breed breed;
    Species species;
    
    Species get_species() {
        return species;
    }
    
    Food get_food() {
        return food;
    }
}


