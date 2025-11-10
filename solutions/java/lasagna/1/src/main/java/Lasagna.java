public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven){
        Lasagna lasagna = new Lasagna();
        int minutesInOven = actualMinutesInOven;
        int expectedMinutesInOven = lasagna.expectedMinutesInOven();
        int remainingTime = expectedMinutesInOven - minutesInOven;

        return remainingTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayersInput){
        int timeForOneLayer = 2;
        int numberOfLayers = numberOfLayersInput;

        return timeForOneLayer * numberOfLayers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayersInput, int numberOfMinutesInOvenInput){
        Lasagna lasagna = new Lasagna();
        int timeForPreparation = lasagna.preparationTimeInMinutes(numberOfLayersInput);
        int numberOfMinutesInOven = numberOfMinutesInOvenInput;

        return timeForPreparation + numberOfMinutesInOven;
        
    }
}
