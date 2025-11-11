public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
       
        int level = character.getLevel();

        String characterClass = character.getCharacterClass();

        int hitpoints = character.getHitPoints();

        return "You're a level " + level + " " + characterClass + " with " + hitpoints + " hit points.";
        
    }
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination){

        String name = destination.getName();
        int inhabitants = destination.getInhabitants();

        return "You've arrived at " + name + ", which has " + inhabitants + " inhabitants.";
    }

    
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod){
       switch(travelMethod){
            case WALKING:
                return "You're traveling to your destination by walking.";
            case HORSEBACK:
                return "You're traveling to your destination on horseback.";
            default:
            return "You're traveling to your destination by walking.";
        }
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod){

        String characterDescribe = describe(character);
        String destinationDescribe = describe(destination);
        String travelMethodDescribe = describe(travelMethod);

        return characterDescribe  + " " +  travelMethodDescribe + " " + destinationDescribe;
        
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination){
        return describe(character, destination, TravelMethod.WALKING);
    }

    
}
