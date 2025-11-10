public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutesInOven){
        Lasagna lasagna = new Lasagna();
        int minutesInOven = actualMinutesInOven;
        int expectedMinutesInOven = lasagna.expectedMinutesInOven();
        int remainingTime = expectedMinutesInOven - minutesInOven;

        return remainingTime;
    }

    public int preparationTimeInMinutes(int numberOfLayersInput){
        int timeForOneLayer = 2;
        int numberOfLayers = numberOfLayersInput;

        return timeForOneLayer * numberOfLayers;
    }
    
    public int totalTimeInMinutes(int numberOfLayersInput, int numberOfMinutesInOvenInput){
        Lasagna lasagna = new Lasagna();
        int timeForPreparation = lasagna.preparationTimeInMinutes(numberOfLayersInput);
        int numberOfMinutesInOven = numberOfMinutesInOvenInput;

        return timeForPreparation + numberOfMinutesInOven;
        
    }
}
