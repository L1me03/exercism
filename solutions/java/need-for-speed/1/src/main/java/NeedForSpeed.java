class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int battery = 100;
    public int distanceDriven = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        if(battery < batteryDrain){
            return true;     
        }return false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50,4);
        return nitro;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
      
        int possibleDistance = car.speed * (car.battery /car.batteryDrain);

        if(possibleDistance >= distance){
            return true;
        }else{
        return false;
    }
}
}
